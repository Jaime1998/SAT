package reduction.Main;
import reduction.Antlr.SatParser;
import reduction.Antlr.SatParserBaseVisitor;

import java.util.List;

public class SatVisitor extends SatParserBaseVisitor <String> {

    @Override
    public String visitDocument(SatParser.DocumentContext ctx) {
        String document = "";

        List<SatParser.CommentaryContext> comments = ctx.commentary();

        for(SatParser.CommentaryContext comment: comments){
            document = document.concat(visit(comment));
        }

        return document;
    }

    @Override
    public String visitCommentary(SatParser.CommentaryContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitHeader(SatParser.HeaderContext ctx) {
        return super.visitHeader(ctx);
    }

    @Override
    public String visitClause(SatParser.ClauseContext ctx) {

        return super.visitClause(ctx);
    }
}
