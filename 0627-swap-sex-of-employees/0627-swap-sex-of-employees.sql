# Write your MySQL query statement
update Salary
set sex=CASE
when sex='m'then 'f'
when sex='f'then 'm'
END;