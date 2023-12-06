# Write your MySQL query statement below
Select unique_id, name From Employees E LEFT OUTER JOIN EmployeeUNI U ON E.id = U.id;