SELECT  a.Staff_Name, COUNT(m.Staff_code)
FROM Staff_Master a join Staff_master m
on m.Mgr_code=a.Staff_code
	GROUP BY a.Staff_Name;
