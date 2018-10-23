package com.cg.payroll.dao;

import com.cg.payroll.beans.Associate;

public interface AssociateDAO {
	Associate save(Associate associate);
	Associate findOne(int associateId);
	Associate[] findAll();
}
