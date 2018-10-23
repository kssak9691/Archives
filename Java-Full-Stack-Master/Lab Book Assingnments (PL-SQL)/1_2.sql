DECLARE 
var_num1 NUMBER := 5;
BEGIN
<<INNER_BLOCK>>
DECLARE 
var_num1 NUMBER := 10;
BEGIN
DBMS_OUTPUT.PUT_LINE('Value for var_num1:' ||var_num1);
DBMS_OUTPUT.PUT_LINE('Value for outer var_num1:' ||OUTER_BLOCK.var_num1);
END;