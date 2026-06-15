# Write your MySQL query statement below
-- select a.actor_id,b.director_id
-- from ActorDirector a
-- join ActorDirector b
-- -- group 
-- -- on a.actor_id=b.director_id
-- -- order by actor_id
-- -- limit 4,1
select actor_id , director_id from ActorDirector 
group by actor_id , director_id
 having count(*)>=3
