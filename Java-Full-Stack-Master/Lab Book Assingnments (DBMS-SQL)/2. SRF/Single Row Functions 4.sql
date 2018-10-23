SELECT * from Staff_Master
                   WHERE to_char(HireDate, 'MON DD') >='DEC 01' and to_char(HireDate, 'MON DD') <='DEC 15'; 
