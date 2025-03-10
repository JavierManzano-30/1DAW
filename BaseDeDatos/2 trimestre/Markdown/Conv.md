
```sql
SELECT OrderID, CONV(OrderID, 10, 16) AS OrderID_Hex
FROM Orders
LIMIT 10;