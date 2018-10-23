SELECT Staff_code,Staff_Name,Dept_code from Staff_master
                WHERE trunc(months_between(sysdate,HireDate)/12)>=18
                 order by trunc(months_between(sysdate,HireDate)/12);