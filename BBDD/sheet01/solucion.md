# Ejercicio 1: Biblioteca

## Descripción

Diseña una base de datos para una biblioteca que permita gestionar los libros y los préstamos.

### Requisitos:

1. La biblioteca tiene libros. Cada libro tiene un título, autor, editorial, año de publicación y número de páginas.
2. Los usuarios de la biblioteca pueden tomar libros prestados. Cada usuario tiene un nombre, dirección y número de teléfono.
3. Cada préstamo de libro debe registrar la fecha de préstamo, la fecha de devolución y el usuario que tomó prestado el libro.

## Pasos a seguir

### 1. Identificar las entidades principales y sus atributos

- **Libros:**

  - ID (PK)
  - Titulo
  - Autor
  - Editorial
  - Ano_de_publicacionon
  - Numero_de_paginas

- **Usuarios:**

  - ID (PK)
  - Nombre
  - Direccion
  - Numero_de_telefono

- **Préstamos:**
  - ID (PK)
  - Libro_ID (FK)
  - Usario_ID (FK)
  - Fecha_de_prestamo
  - Fecha_de_devolucion

### 2. Definir las relaciones entre las entidades

- Un libro puede ser prestado a muchos usuarios.
- Un usuario puede tomar prestados muchos libros.
- La relación entre `Libros` y `Usarios` es de muchos a muchos (`Many-to-Many`), y se implementa mediante la tabla intermedia `Préstamos`.

### 3. Crear el diagrama ERD

#### Diagrama ERD:

![diagrama](/BBDD/sheet01/E-R%20diagrama.png)
