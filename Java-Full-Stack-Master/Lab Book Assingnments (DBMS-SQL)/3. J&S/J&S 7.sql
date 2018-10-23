SELECT Book_pub_author,Book_Name FROM Book_Master
	WHERE Book_pub_author IN (SELECT Book_pub_author FROM Book_Master
			GROUP BY Book_pub_author	HAVING COUNT(Book_Code)>1);
