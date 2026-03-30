## **=========================ASSIGNMENT-1 QUESTIONS=============================**

###### 

###### 1)List all employees, ordered by their HIREDATE from newest to oldest.

###### 

###### 2)List all employees who work in 'DALLAS'.

###### 

###### 3)Find all employees who were hired in the year 1981.

###### 

###### 4)List the DNAME and LOC from the DEPT table, ordered alphabetically by location.

###### 

###### 5)List all employees who do not work in Department 10.

###### 

###### 6)Display all employees who were hired after January 1st, 1982.

###### 

###### 7)Show what each employee’s salary would be if they were given a 15% raise. Display the ENAME, SAL, and the NEW\_SAL.

###### 

###### 8)List all employees, sorted first by their Department Number (ascending) and then by their Salary (descending).

###### 

###### 9)List all employees whose total monthly income (Salary + Commission) is greater than 1500.

###### 

###### 10)Find all 'SALESMAN' who earn a salary that is not between 1200 and 1500.



## **=========================SOLUTION=============================**



#### **Basic Pre-Queries :** 

##### 

###### SHOW DATABASES;

###### 

###### USE cdac;

###### 

###### SHOW TABLES;

###### 

###### SELECT \* FROM emp;

###### 

###### SELECT \* FROM dept;

###### 

###### SELECT \* FROM salgrade;



#### **Solution Queries (1 to 10) :** 

##### 

1. SELECT empno, ename, job, hiredate, sal FROM emp ORDER BY hiredate DESC;

   ---
2. SELECT empno, ename, job, deptno, dname, loc, sal FROM emp NATURAL JOIN dept WHERE loc = 'Dallas';

   ---
3. SELECT \* FROM emp WHERE YEAR(hiredate) = 1981;

   ---
4. SELECT dname, loc FROM dept ORDER BY loc;

   ---
5. SELECT empno, ename, job, hiredate, sal, deptno FROM emp WHERE NOT deptno = '10';

   ---
6. SELECT \* FROM emp WHERE hiredate > '1982-01-01';

   ---
7. SELECT empno, ename, sal, (sal \* 1.15) AS New\_Sal FROM emp;

   ---
8. SELECT \* FROM emp ORDER BY deptno ASC, sal DESC;

   ---
9. SELECT empno, ename, sal, (sal + IFNULL(comm,0)) AS Total\_Monthly\_Income FROM emp WHERE (sal + IFNULL(comm,0)) > 1500;

   ---
10. ###### SELECT empno, ename, job, sal FROM emp WHERE job = 'Salesman' AND sal NOT BETWEEN 1200 AND 1500;

