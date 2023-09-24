--Given Employees table with columns Id, Name, Email and Salary,
--write an SQL query to retrieve the different salaries earned by employeed in increasing order

SELECT DISTINCT Salary
FROM Employees
ORDER BY Salary ASC;