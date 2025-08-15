/* Write your PL/SQL query statement below */
select P.firstName,P.lastName,A.city,A.state
from Person P , Address A where
 P.personId=A.personId(+);