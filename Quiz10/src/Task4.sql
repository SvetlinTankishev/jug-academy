--Given tables Employees with columns Id, Name, Email and Salary write an SQL query to return
--the different salaries earned by employees along with how many employees earn that salary as Salary and Count columns.

SELECT Salary, COUNT(*) AS Count
FROM Employees
GROUP BY Salary;