# Write your MySQL query statement below
select p.product_id , COALESCE(round(sum(u.units*p.price)/sum(u.units),2),0) 'average_price'
from Prices p 
left join UnitsSold u
on p.product_id = u.product_id AND u.purchase_date BETWEEN start_date AND end_date
group by product_id;