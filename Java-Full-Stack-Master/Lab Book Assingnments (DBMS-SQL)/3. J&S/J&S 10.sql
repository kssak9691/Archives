SELECT Staff_code, Staff_Name, Dept_name, Design_name,HireDate 
	FROM Staff_Master NATURAL JOIN Department_Master
				NATURAL JOIN Designation_Master
	WHERE MONTHS_BETWEEN(sysdate,HireDate)<=3;