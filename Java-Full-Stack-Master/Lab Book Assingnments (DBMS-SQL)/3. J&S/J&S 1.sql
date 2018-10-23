SELECT Staff_Master.Staff_Name, Staff_master.Dept_code, Department_Master.Dept_name, Staff_Master.Staff_sal
    FROM Staff_Master
             INNER JOIN Department_Master ON Staff_Master.Dept_code = Department_Master.Dept_code
			         WHERE Staff_Master.Staff_sal>20000; 
