# Write your MySQL query statement below
select product_id 
from Products
where low_fats="y" 
and recyclable="y"
order by product_id asc;