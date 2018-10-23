SELECT Deptno, SUM(Sal) FROM Emp
                    WHERE mgr is NULL
                                  GROUP BY Deptno
                                             HAVING SUM(Sal)>20000;