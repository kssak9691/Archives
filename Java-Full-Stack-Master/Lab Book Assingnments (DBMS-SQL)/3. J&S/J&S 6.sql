SELECT Staff_code,Staff_Name,Staff_sal FROM Staff_Master 
	WHERE Staff_sal<(SELECT AVG(Staff_sal) FROM Staff_Master);	