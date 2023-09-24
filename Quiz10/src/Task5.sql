--Given tables Employees with columns Id, Name, Email and Salary, EmployeeDeparments
--with columns Id, EmployeeId, DepartmentId and Departments with columns Id, Name
--write an SQL query to return the names of Deparments along with the number of employees
--in each department as Name and Count columns

--Note: Use LEFT joins

SELECT D.Name AS Name, COUNT(ED.EmployeeId) AS COUNT
FROM Departments D
LEFT JOIN EmployeeDeparments ED ON D.Id = ED.DepartmentId
LEFT JOIN Employees E ON ED.EmployeeId = E.Id
GROUP BY D.Name;