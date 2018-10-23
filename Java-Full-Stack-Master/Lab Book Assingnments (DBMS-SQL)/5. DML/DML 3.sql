update Employee
  set job=(select job from employee where empno=7788) where empno=7698;
  
update Employee
  set deptno=(select deptno from employee where empno=7788) where empno=7698;
  