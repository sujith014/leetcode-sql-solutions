# Write your MySQL query statement below
select distinct(viewer_id) AS "id" from Views
where viewer_id = author_id
order by viewer_id asc;