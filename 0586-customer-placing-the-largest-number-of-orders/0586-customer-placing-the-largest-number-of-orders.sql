# Write your MySQL query statement below
-- select customer_number from Orders
-- -- group by customer_number
-- -- having count(*)=1
-- select customer_number from Orders
-- where customer_number =1;
-- select max(customer_number) as customer_number from Orders;
select customer_number from Orders
group  by customer_number
order by count(*) desc
limit 1
