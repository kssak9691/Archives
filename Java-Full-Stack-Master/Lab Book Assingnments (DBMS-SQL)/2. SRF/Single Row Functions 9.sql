SELECT Student_Code, Student_name, 
             DECODE(Dept_Code,20,'Electricals', DECODE(Dept_Code,30,'Electronics','Others')) as "Dept Name" from Student_Master;