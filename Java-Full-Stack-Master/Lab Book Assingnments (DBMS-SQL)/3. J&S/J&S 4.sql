select Book_Transactions.staff_code,staff_name,dept_name,design_Name,
Book_Transactions.book_code,book_name,book_issue_date
from Staff_Master,Book_Master,Book_Transactions,Designation_Master,
Department_Master
where Book_Transactions.staff_code=Staff_Master.staff_code
and Department_Master.dept_code=Staff_Master.dept_code
and Designation_Master.design_code=Staff_Master.design_code
and Book_Transactions.book_code=Book_Master.book_code
and book_issue_date > sysdate-30;