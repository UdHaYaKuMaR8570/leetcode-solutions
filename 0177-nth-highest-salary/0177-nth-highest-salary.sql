CREATE FUNCTION getNthHighestSalary(n INT) RETURNS INT
BEGIN
    set n=n-1;
  RETURN (
    SELECT DISTINCT salary from Employee 
     order by salary desc 
     limit n,1
  );
END