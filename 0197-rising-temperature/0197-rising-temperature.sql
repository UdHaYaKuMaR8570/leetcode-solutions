# Write your MySQL query statement below
select w.id from Weather w
left join 
weather b
on datediff(w.recordDate,b.recordDate)=1
where b.temperature < w.temperature