
```sql
SELECT EmployeeID, CONCAT_WS(' ', FirstName, LastName) AS FullName
FROM Employees;
