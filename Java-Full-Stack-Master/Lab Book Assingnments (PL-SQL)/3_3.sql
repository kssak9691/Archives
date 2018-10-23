create or replace function CostToComp(code in number) return number
is
    sal staff_master.staff_sal%type;
    exp number;
BEGIN
    select staff_sal,round(months_between(sysdate,hiredate)/12) as EXP into sal, exp from staff_master where staff_code=code;
    if exp>4 then
    sal:=sal+ (0.3*sal)+(0.15*sal)+(0.2*sal)+(0.08*sal);
    elsif exp between 2 and 4 then
    sal:=sal+ (0.2*sal)+(0.15*sal)+(0.2*sal)+(0.08*sal);
    elsif exp between 1 and 2 then
    sal:=sal+ (0.1*sal)+(0.15*sal)+(0.2*sal)+(0.08*sal);
    else 
    sal:=sal+(0.15*sal)+(0.2*sal)+(0.08*sal);
    end if;
    return sal;
end;
 
 
DECLARE 
    CALC_SAL NUMBER;
BEGIN
    CALC_SAL:=CostToComp(&staff_code);
    dbms_output.put_line(CALC_SAL);
END;
/