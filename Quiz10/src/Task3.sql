--Given tables Employees with columns Id, Name, Email and Salary and Bonuses
--with columnsd Id, EmployeeId and Bonus write and SQL query that returns
--the name and  salary of employees that have salaries higher than the maximum bonus existing.

SELECT Name, Salary
FROM Employees
WHERE Salary > (SELECT MAX(Bonus) FROM Bonuses)
AND (SELECT MAX(Bonus) FROM Bonuses) IS NOT NULL;