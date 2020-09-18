parser grammar SatParser;

@parser::members { // add members to generated UppaalParser
    private int numNewVariables=0;
    private int numNewClauses

    public int getNewVariables(){
        return this.numNewVariables;
    }
    public int getNewClauses(){
        return this.numNewClauses();
    }
}

options { tokenVocab=SatLexer; }

document    :   COMMENT_BREAK* commentary*  header clause+ BREAK*;

commentary  :   COMMENT COMMENT_BREAK+;

header      :   'p' 'cnf' NUMBER NUMBER;

clause      :   BREAK+ NUMBER NUMBER NUMBER ('0')?;


