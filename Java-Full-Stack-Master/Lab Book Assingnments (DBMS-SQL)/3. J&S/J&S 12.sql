select book_name from
Book_Master,Book_Transactions
where Book_Master.book_code=Book_Transactions.book_code
and next_day(sysdate-7,'Monday')=book_expected_return_date;