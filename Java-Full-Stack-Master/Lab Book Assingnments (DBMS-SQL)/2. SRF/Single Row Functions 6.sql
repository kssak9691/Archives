SELECT Staff_Name, HireDate, to_char(HireDate,'DY') as "DAY" from Staff_Master
           order by mod(to_char(HireDate, 'D') +5, 7);