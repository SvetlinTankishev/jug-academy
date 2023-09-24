--Given tables Employees with columns Id, Name, Email and Salary,
--EmployeeDeparments with columns Id, EmployeeId, DepartmentId and Departments with columns Id,
--Name write an SQL query to return the names and departments of each employees
--(including the employees that do not have a department) as Name and Department columns.

SELECT E.Name AS NAME, COALESCE(D.NAME, '') AS DEPARTMENT
FROM Employees E
LEFT JOIN EmployeeDeparments ED ON E.Id = ED.EmployeeId
LEFT JOIN Departments D ON ED.DepartmentId = D.Id;