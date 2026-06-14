# Write your MySQL query statement below
-- SELECT c.id
-- from Customers c
-- left join Orders o
-- on c.id=o.customerId
-- where o.customerId is NULL
-- select id from Customers
-- where id not in(select  customerId from Orders)
-- SELECT c.id
-- FROM Customers c
-- LEFT JOIN Orders o
-- ON c.id = o.customerId
-- WHERE o.customerId IS NULL;
select c.name as Customers   from  Customers c
left join Orders o
on c.id =o.customerId
where o.customerId is null 
