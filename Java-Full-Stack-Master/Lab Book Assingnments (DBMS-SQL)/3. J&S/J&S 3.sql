SELECT Student_Code, Student_name, Book_Code, Book_Name 
           FROM Student_Master natural join Book_Master natural join Book_Transactions
	WHERE Book_expected_return_date=to_char(sysdate);