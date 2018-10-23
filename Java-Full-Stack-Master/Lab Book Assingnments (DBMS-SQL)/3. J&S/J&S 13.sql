select a.dept_code,a.dept_name,a.stu+b.sta as total 
	from (select d.dept_code,d.dept_name,count(*) as stu from student_master s join department_master d on s.dept_code=d.dept_code
		group by d.dept_code,d.dept_name) a left outer join	(select d.dept_code,d.dept_name,count(*) as sta 
			from staff_master s	join department_master d on s.dept_code=d.dept_code
				group by d.dept_code,d.dept_name)b 
					on a.dept_code=b.dept_code and a.dept_name=b.dept_name;