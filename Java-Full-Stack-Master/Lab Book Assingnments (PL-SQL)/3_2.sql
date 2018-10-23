create or replace procedure findMGR
(
SNo in staff_master.staff_code%type,
SId out staff_master.staff_code%type,
SName out staff_master.staff_name%type,
DCode out staff_master.dept_code%type,
MName out staff_master.staff_name%type
)
as 
BEGIN
    select a.staff_code,a.staff_name,a.dept_code,b.staff_name as manager into SId,SName,DCode,MName 
    from  staff_master a,staff_master b 
    where a.mgr_code=b.staff_code and a.staff_code = SNo;
    if(sql%notfound) then
        raise no_data_found;
    end if;   
    exception
        when no_data_found then
            dbms_output.put_line('staff code not found');
end;
-------
declare
SId  staff_master.staff_code%type;
SName  staff_master.staff_name%type;
DCode  staff_master.dept_code%type;
MName  staff_master.staff_name%type;
begin
	findMGR(100002,SId,SName,DCode,MName);
	dbms_output.put_line(SId||' '||SName||' '||DCode||' '||MName);
end;
/