SELECT Staff_name, Staff_sal, CASE WHEN Staff_sal>=50000 THEN 'A'
                                                             WHEN Staff_sal>=25000  AND Staff_sal<50000 THEN 'B'
			       WHEN Staff_sal>=10000  AND Staff_sal<25000 THEN 'C'
			       ELSE 'D'
		                END AS "GRADE"
 from Staff_Master;