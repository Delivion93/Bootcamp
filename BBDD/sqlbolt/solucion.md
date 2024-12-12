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
