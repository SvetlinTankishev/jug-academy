--Given tables Employees with columns Id, Name, Email and Salary
--and Bonuses with columnsd Id, EmployeeId and Bonus write and SQL query that returns the name,
--salary and bonus for each employees including the ones that don't have a bonus.

SELECT E.Name, E.Salary, B.Bonus
FROM Employees E
Left Join Bonuses B ON E.Id = B.EmployeeId;