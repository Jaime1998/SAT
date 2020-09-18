parser grammar SatParser;
options { tokenVocab=SatLexer; }

document    :   commentary*  header clause+ BREAK*;

commentary  :   COMMENT COMMENT_BREAK+;

header      :   'p' 'cnf' NUMBER NUMBER;

clause      :   BREAK+ NUMBER NUMBER NUMBER;

