/**
 * Define a grammar called Hello
 */
grammar HEQL;

message: .*? heql_block .*?;

heql_block: '<?' HEQL (selectNext|selectDistinct|selectBase) '?>' ('|' format)?;

selectBase: SELECT fieldList FROM EVENTS (WHERE condition)? ';'?;

selectNext: SELECT NEXT fieldList FROM EVENTS (WHERE condition)? ';'?;

selectDistinct: SELECT DISTINCT selField FROM EVENTS (WHERE condition)? ';'?;

condition: (condField|literal) operator (condField|literal)  # condComparison
			| condition logicalAnd condition			 	 # condLogicalAnd
			| leftParen condition rightParen				 # condParen
			| condition logicalOr condition			 		 # condLogicalOr
			
			;

logicalOr: OR;

logicalAnd: AND;

leftParen: '(';

rightParen: ')';

selField: OBJECT;

condField: OBJECT;

fieldList: (selField (',' selField)*) | '*';

operator: OPERATOR;

literal: LITERAL;

format: FORMAT;

FORMAT: 'pretty'|'json'|'hammersay';

HEQL: H E Q L;

AND: A N D;

OR: O R;

OPERATOR: (L I K E) | ('=');

DISTINCT: D I S T I N C T;

FROM: F R O M;

WHERE: W H E R E;

EVENTS: E V E N T S;

NEXT: N E X T;

SELECT: S E L E C T;

OBJECT: [a-zA-Z_]+;

LITERAL: '\'' ( ~'\'' | '\\\'' )* '\'';

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

UNEXPECTED_CHAR: .; // In case we don't define a token


fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];
