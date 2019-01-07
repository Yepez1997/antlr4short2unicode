/* Converts an array of integers with a string of binary strings
*  for compactness
*  More precisely this grammar translates short
*/
grammar ArrayInit;

// rule that matches comma sererated values between {...}
// inside can be multiple ints or can be nested (..)* implies at least one value
init : '{' value ( ',' value)* '}';

// value that can nested in an array/struct or a simple integer
value : init
      | INT
      ;

INT : [0-9]+ ; // regular expression for an integer
WS  :  [ \t\r\n]+ -> skip ; // grammar handles whitespace





