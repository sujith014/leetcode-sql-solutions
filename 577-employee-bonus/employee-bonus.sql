# Write your MySQL query statement below
SELECT EMP.name , Bonus.bonus 
FROM Employee EMP
LEFT JOIN Bonus
ON  EMP.empId = Bonus.empId 
WHERE Bonus.bonus < 1000 || Bonus.bonus IS NULL;