select distinct Book_Transactions.staff_code,count(book_code)
from Staff_Master,Book_Transactions
where Staff_Master.staff_code=Book_Transactions.staff_code
group by(Book_Transactions.staff_code) having(count(book_code)>1);