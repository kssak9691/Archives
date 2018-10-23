SELECT Dept_code, COUNT(Mgr_code) AS "Total Number of Managers" 
                   FROM Staff_Master
                              GROUP BY Dept_code;