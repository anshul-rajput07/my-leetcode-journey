# Write your MySQL query statement below
select product_name , sum(unit) as unit from Products natural join Orders 
where order_date between '2020-02-01' and '2020-02-29'
group by Orders.product_id 
having sum(unit) >= 100 