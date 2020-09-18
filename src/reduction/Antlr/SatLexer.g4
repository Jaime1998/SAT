lexer grammar SatLexer;

COMMENT :   'c' ~('\r' | '\n')* ;

START   :   '\r'? '\n';

P       :   'p'                 -> pushMode (HEADER);

// ----------------- Everything AFTER p ---------------------
mode HEADER;
CNF     :   'cnf';

fragment
DIGIT   :   [0-9];

NUMBER  :   ('-')? DIGIT+;

BREAK   :   '\r'? '\n';
WS      :   [ \t]+              -> skip;