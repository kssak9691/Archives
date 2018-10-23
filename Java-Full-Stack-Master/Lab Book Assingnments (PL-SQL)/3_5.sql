create or replace procedure insertrecords
	(bcode in book_transactions.book_code%type,
	code in number
)
as
	code1 number;
	exc exception;
	doe varchar2(50);
	doe1 date;
	cursor mycur1 is 
	select staff_code from staff_master where staff_code=code;
	cursor mycur2 is 
	select student_code from student_master where student_code=code;
begin 
	select to_char(sysdate+10,'DAY') INTO doe FROM DUAL;
	if(doe='SATURDAY') then
		select (sysdate+12) INTO doe1 FROM DUAL;
	elsif (doe='SUNDAY')then
		select (sysdate+11) INTO doe1 FROM DUAL;
	else
		select (sysdate+10) INTO doe1 FROM DUAL;
	end if;
	open mycur1;
	open mycur2;
	loop
		fetch mycur1 into code1;
		if(mycur1%notfound and mycur1%rowcount=0) then
			fetch mycur2 into code1;
			if(mycur2%notfound and mycur2%rowcount=0) then
				raise exc;
			else
				exit when(mycur2%notfound);
				insert into book_transactions values(bcode,code1,null,sysdate,doe1,null);
			end if; 
		else
			exit when(mycur1%notfound);
			insert into book_transactions values(bcode,null,code1,sysdate,doe1,null);
		end if;
	end loop;
exception
	when exc then
	dbms_output.put_line('not found');
end;
/
show error;
delete from  book_transactions where book_issue_date LIKE '%07-OCT-17%';
 
execute insertrecords(10000007,100002);
execute insertrecords('10000002','1015'); 
