SELECT * from Book_Master
                         WHERE Book_pub_year>=2001 AND Book_pub_year<=2004 
                                      AND Book_Name LIKE '%&%';