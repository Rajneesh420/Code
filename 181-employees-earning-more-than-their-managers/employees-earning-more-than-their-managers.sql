/* Write your PL/SQL query statement below */
select e.name Employee
from Employee e,Employee b
where b.id=e.managerId
and e.salary > b.salary;

