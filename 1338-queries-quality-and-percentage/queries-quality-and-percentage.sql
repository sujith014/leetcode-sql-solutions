# Write your MySQL query statement below
select query_name , round(avg(rating/position) ,2) "quality", 
round( sum(if(rating < 3,1,0)) * 100 / count(*) , 2) "poor_query_percentage"
from Queries
group by query_name
having query_name is not null;