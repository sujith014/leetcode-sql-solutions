# Write your MySQL query statement below
select 
round(sum(order_date = customer_pref_delivery_date)*100 / count(*) , 2)
'immediate_percentage' 
from (select customer_id , min(order_date) AS 'first_order_date' 
        from Delivery group by customer_id) AS first_order
join Delivery d
on first_order.customer_id = d.customer_id AND first_order.first_order_date = d.order_date;