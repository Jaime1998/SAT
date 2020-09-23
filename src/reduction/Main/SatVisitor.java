package reduction.Main;
import org.antlr.v4.runtime.tree.TerminalNode;
import reduction.Antlr.SatParser;
import reduction.Antlr.SatParserBaseVisitor;
import java.lang.Math;
import java.util.List;

public class SatVisitor extends SatParserBaseVisitor <String> {

    private int max = 0;
    private int xsat = 5;
    @Override
    public String visitDocument(SatParser.DocumentContext ctx) {
        String document = "";
        List<SatParser.CommentaryContext> comments = ctx.commentary();

        for(SatParser.CommentaryContext comment: comments){
            document = document.concat(visit(comment));
        }

        document = document.concat("c this problem was reduced from n-sat to x-sat\n").concat(visit(ctx.header())).concat("\n");

        List<SatParser.ClauseContext> clauses = ctx.clause();

        for (SatParser.ClauseContext clause: clauses){
            document = document.concat(visit(clause));
        }
        //cambio de cnf y comentarios por nuevos parametros del sat

        return document;
    }

    @Override
    public String visitCommentary(SatParser.CommentaryContext ctx) {

        return ctx.getText();
    }

    @Override
    public String visitHeader(SatParser.HeaderContext ctx) {
        String header = "p cnf ";
        header = header.concat(ctx.NUMBER(0).getText()).concat(" ").concat(ctx.NUMBER(1).getText());
        this.max = Integer.parseInt(ctx.NUMBER(0).getText()) + 1;
        return header;
    }

    @Override
    public String visitClause(SatParser.ClauseContext ctx) {
        String clause = "";
        List<TerminalNode> numbers = ctx.NUMBER();

        String auxClause = "";
        for(TerminalNode number: numbers) {
            auxClause = auxClause.concat(number.getText()).concat(" ");
        }
        // si el tamaño de la clausula es menor o igual al sat destino
        if (numbers.size() <= this.xsat){
            //creo 2^{x-k} clausulas
            for (int newClauses = 0; newClauses < Math.pow(2,this.xsat - numbers.size()); newClauses+= 1){
                //combinaciones de variables en negativos y positivos para cada clausula
                String combination = Integer.toBinaryString(newClauses);
                while(combination.length() < (this.xsat - numbers.size()))
                    combination = "0" + combination;
                //preparon la concatenacion de la clausula
                clause = clause.concat(auxClause);
                //creo x-k variables
                for (int newVariable = 0; newVariable < this.xsat - numbers.size(); newVariable+= 1){
                    //si de la combinacion creada antes es uno, la variable es negativa
                    if (combination.charAt(newVariable) == '1'){
                        clause = clause.concat("-");
                    }
                    //concateno la variable nueva
                    clause = clause.concat(String.valueOf(this.max + newVariable)).concat(" ");
                }
                clause = clause.concat("\n");
            }
            //seteo mi siguiente valor maximo como el anterior mas la cantidad de variables agregadas
            this.max = this.max + this.xsat - numbers.size();
        }else {
            // si el tamaño de la clausula es mayor o igual al sat destino
            if (numbers.size() > this.xsat) {
                //creo x-x+1 clausulas
                //creo k-x variables
                this.max = this.max + 1;
            }
        }
        return clause;
    }
}
