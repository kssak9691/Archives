SELECT Staff_Master.Staff_code AS "Staff#", Staff_master.Staff_Name AS "Staff", Department_Master.Dept_name, Staff_Master.Mgr_Code AS "Mgr#"
                  FROM Staff_Master
                      INNER JOIN Department_Master ON Staff_Master.Dept_code = Department_Master.Dept_code;