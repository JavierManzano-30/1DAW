
```sql
SELECT p.ProductName
FROM customers c
INNER JOIN orders o ON c.CustomerID = o.CustomerID
	INNER JOIN orderdetails od ON o.OrderID = od.OrderID
		INNER JOIN products p ON od.ProductID = p.ProductID
			WHERE c.CustomerName LIKE 'B%';