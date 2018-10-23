SELECT Staff_Name, trunc(months_between(sysdate,HireDate)) as "Months Worked" from Staff_Master
             ORDER BY trunc(months_between(sysdate,HireDate));