parser grammar SatParser;
options { tokenVocab=SatLexer; }

document    :   commentary* START header clause+;

commentary  :   COMMENT ;

header      :   'p' 'cnf' NUMBER NUMBER;

clause      :   BREAK NUMBER NUMBER NUMBER;

