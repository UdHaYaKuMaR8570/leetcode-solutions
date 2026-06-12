# Write your MySQL query statement below
-- select emplyee_id,
-- Having  <30000
-- select e.employee_id from employee e
-- select employee_id from Employees
-- where salary<30000 
select employee_id from Employees
where salary<30000
and manager_id not in(select employee_id from Employees )
order by employee_id