# Solutions of SQLBolt Exercices

---

## Ex1

#### Task 1

```SQL
SELECT Title FROM Movies
```

### Task2

```SQL
SELECT Director FROM Movies
```

#### Task3

```SQL
SELECT Title, Director FROM Movies
```

#### Task4

```SQL
SELECT Title, Year FROM Movies
```

#### Task5

```SQL
SELECT * FROM Movies
```

---

## Ex2

#### Task 1

```SQL
SELECT * FROM movies
WHERE id=6;
```

#### Task 2

```SQL
SELECT * FROM movies
WHERE year between 2000 and 2010;
```

#### Task 3

```SQL
SELECT * FROM movies
WHERE year not between 2000 and 2010;
```

#### Task 4

```SQL
SELECT title, year FROM movies
WHERE year <= 2003;
```

---

## Ex3

#### Task 1

```SQL
SELECT * FROM Movies
WHERE Title LIKE "Toy Story%";
```

#### Task2

```SQL
SELECT * FROM Movies
WHERE Director="John Lasseter";
```

#### Task3

```SQL
SELECT * FROM Movies
WHERE Director="John Lasseter";
```

#### Task4

```SQL
SELECT * FROM Movies
WHERE Director!="John Lasseter";
```

#### Task5

```SQL
SELECT * FROM Movies
WHERE Title LIKE "WALL%";
```

---

## Ex4

#### Task1

```SQL
SELECT DISTINCT Director FROM movies
ORDER BY Director;
```

#### Task2

```SQL
SELECT * FROM Movies
ORDER BY YEAR DESC
LIMIT 4;
```

#### Task3

```SQL
SELECT * FROM Movies
ORDER BY Title
LIMIT 5;
```

#### Task4

```SQL
SELECT * FROM Movies
ORDER BY Title
LIMIT 5 OFFSET 5;
```

---

## Ex5

#### Task 1

```SQL
SELECT * FROM north_american_cities
WHERE Country="Canada";
```

#### Task 2

```SQL
SELECT * FROM north_american_cities
WHERE Country="United States"
ORDER BY latitude DESC;
```

#### Task 3

```SQL
SELECT * FROM north_american_cities
WHERE longitude<-87.629798
ORDER BY Longitude;
```

#### Task 4

```SQL
SELECT * FROM north_american_cities
WHERE Country = "Mexico"
ORDER BY Population DESC
LIMIT 2;
```

#### Task 5

```SQL
SELECT City,Population FROM north_american_cities
WHERE Country="United States"
ORDER BY Population DESC
LIMIT 2 OFFSET 2;
```

---

## Ex6

#### Task1

```SQL

```

#### Task2

```SQL
SELECT Title,Domestic_sales,International_sales FROM Movies
INNER JOIN Boxoffice
    ON Movies.Id=Boxoffice.Movie_id
WHERE Boxoffice.International_sales>Boxoffice.Domestic_sales;
```

#### Task3

```SQL
SELECT Title,Rating FROM Movies
INNER JOIN Boxoffice
    ON Movies.Id=Boxoffice.Movie_id
ORDER BY Rating DESC
```

---

## Ex7

### Task1

```SQL
SELECT DISTINCT Building_name FROM Buildings
JOIN  Employees
    ON Buildings.Building_name=Employees.Building;
```

### Task2

```SQL
SELECT * FROM Buildings;

```

### Task3

```SQL
SELECT DISTINCT building_name, Role
FROM buildings
  LEFT JOIN employees
    ON building_name = building;
```

---

## Ex8

#### Task1

```SQL
SELECT Name, Role FROM employees
LEFT JOIN Buildings
    ON Employees.Building=Buildings.Building_name
WHERE Building_name IS Null;
```

#### Task2

```SQL
SELECT Building_name FROM Buildings
LEFT JOIN Employees
    ON Buildings.Building_name=Employees.Building
WHERE Building IS Null;
```

---

## Ex9

#### Task1

```SQL
SELECT Title, (Domestic_sales+International_sales)/1000000 AS Millions_of_sales FROM Movies
JOIN boxoffice
    ON Movies.Id=Boxoffice.Movie_id;
```

#### Task2

```SQL
SELECT Title, Rating*10 AS Percent_of_Rating FROM Movies
JOIN boxoffice
    ON Movies.Id=Boxoffice.Movie_id;
```

#### Task3

```SQL
SELECT Title, Year FROM Movies
WHERE year % 2 = 0;
```

---

## Ex10

#### Task 1

```SQL
SELECT MAX(Years_employed) FROM employees;
```

#### Task 2

```SQL
SELECT Role,AVG(Years_employed)AS Average_Employed
FROM Employees
GROUP BY Role;
```

#### Task 3

```SQL
SELECT Building, SUM(Years_employed)
FROM Employees
GROUP BY Building;
```

---

## Ex11

#### Task1

```SQL
SELECT COUNT(Role) FROM Employees
WHERE ROLE="Artist";
```

#### Task2

```SQL
SELECT Role, COUNT(Role) as Number_of_Emloyees
FROM Employees
GROUP BY Role;
```

#### Task3

```SQL
SELECT Role, SUM(Years_employed) as Total_years_employed
FROM Employees
GROUP BY Role
HAVING Role="Engineer";
```

---

## Ex12

#### Task1

```SQL
SELECT Director, COUNT(Title) as Movies_count
FROM Movies
GROUP BY Director;
```

#### Task2

```SQL
SELECT Director, SUM(Domestic_sales+International_sales) AS Total_sales
FROM Movies
LEFT JOIN Boxoffice
    ON Movies.ID=Boxoffice.Movie_id
GROUP BY Director;
```

---

## Ex13

#### Task1

```SQL
INSERT INTO Movies (title,director,year,length_minutes)
VALUES ("Toy Story 4","Artem Abramov", 2024, 93);
```

#### Task2

```SQL
INSERT INTO boxoffice  (movie_id,rating,domestic_sales, international_sales)
VALUES (15,8.7, 340000000, 270000000);
```

---

## Ex14

#### Task1

```SQL
UPDATE movies
SET Director = "John Lasseter"
WHERE id = 2;
```

#### Task2

```SQL
UPDATE movies
SET year = 1999
WHERE id = 3;
```

#### Task3

```SQL
UPDATE movies
SET Title = "Toy Story 3", Director ="Lee Unkrich"
WHERE id = 11;
```
