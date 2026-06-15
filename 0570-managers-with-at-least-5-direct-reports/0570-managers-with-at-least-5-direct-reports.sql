select  e.name from Employee e
join employee m
on e.id=m.managerId
group by e.id, m.managerId
having count(*)>=5