# Write your MySQL query statement below
select request_at as Day ,
Round(sum(if(status != "completed" , 1 , 0))/count(*), 2) as "Cancellation Rate"
from trips join users u1 on trips.client_id = u1.users_id and u1.banned = "No"
           join users u2 on trips.driver_id = u2.users_id and u2.banned = "No"

where  request_at between "2013-10-01" and "2013-10-03"
group by request_at;
       