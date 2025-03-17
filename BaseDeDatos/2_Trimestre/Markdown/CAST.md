
```sql
SELECT OrderID, CustomerID, Freight, CAST(Freight AS SIGNED) AS FreightInt
FROM Orders
LIMIT 10;