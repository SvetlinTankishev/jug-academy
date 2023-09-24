--Given a database with a table Employees with columns Id, Name, Email and Salary
--write an SQL query to retrieve only employees with salary higher than 2000 ordered by name

SELECT Id, Name, Email, Salary
FROM Employees
WHERE Salary > 2000