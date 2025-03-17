
```sql
SELECT LastName, FirstName
FROM employees WHERE EmployeeID IN (
SELECT EmployeeID FROM orders WHERE CustomerID IN
    (SELECT CustomerID FROM customers WHERE Country = 'Germany'));