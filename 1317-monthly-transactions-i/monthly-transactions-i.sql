# Write your MySQL query statement below
select 
left(trans_date,7)  'month',
country,
count(amount) 'trans_count',
sum(if(state = 'approved',1,0)) 'approved_count',
sum(amount) 'trans_total_amount',
sum(if(state = 'approved',amount,0)) 'approved_total_amount'
from Transactions
group by country ,month;