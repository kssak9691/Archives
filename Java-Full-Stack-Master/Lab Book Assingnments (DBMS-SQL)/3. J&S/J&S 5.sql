select Book_Transactions.staff_code,staff_name,design_name,dept_name,
Book_Transactions.book_code,book_name,round((sysdate-book_expected_return_date)*5) as FINE
from Staff_Master,Designation_Master,Department_Master,
Book_Master,Book_Transactions
where Staff_Master.staff_code=Book_Transactions.staff_code
and Department_Master.dept_code=Staff_Master.dept_code
and Designation_Master.design_code=Staff_Master.design_code
and Book_Transactions.book_code=Book_Master.book_code
and book_expected_return_date<book_actual_return_date;