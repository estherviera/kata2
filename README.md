# Kata 2 – Lectura de empleados desde una URL

**Asignatura:** Ingeniería de Software 2  
**Universidad:** Universidad de Las Palmas de Gran Canaria (ULPGC)  
**Repositorio:** https://github.com/estherviera/kata2  
**Rama principal de entrega:** `main`

## 1. Objetivo

El objetivo de esta kata es practicar la lectura de datos de empleados desde un recurso remoto utilizando Java, trabajando con flujos de entrada y salida (Streams).

La práctica permite reforzar el uso de interfaces, la separación de responsabilidades y la gestión de recursos.

## 2. Tecnologías utilizadas

- Java (JDK 27, según `pom.xml`).
- IntelliJ IDEA como entorno de desarrollo.
- Maven para la gestión del proyecto.
- Git y GitHub para el control de versiones.

## 3. Estructura del proyecto

El código está organizado en los siguientes paquetes:

### `software.ulpgc.katas.model`

- **Employee:** record que representa a un empleado mediante su nombre y género.
- **Gender:** enumeración que define los valores `Male` y `Female`.

### `software.ulpgc.katas.io`

- **EmployeeReader:** interfaz que define el método `readAll()` para obtener una lista de empleados.
- **FileEmployeeReader:** clase destinada a la lectura de empleados desde un archivo local.
- **UrlEmployeeReader:** implementación que obtiene los datos desde una URL y los transforma en objetos `Employee`.

### `software.ulpgc.katas`

- **Main:** utiliza `UrlEmployeeReader` para leer los empleados desde Internet y mostrarlos por consola.
- **Main2:** descarga el archivo remoto y lo guarda localmente como `employees.tsv`.

## 4. Compilación y ejecución

### Requisitos

Tener instalado un JDK compatible con la versión configurada en `pom.xml`, Maven y conexión a Internet para acceder al archivo remoto.

### Pasos

1. Clonar el repositorio:

   ```bash
   git clone https://github.com/estherviera/kata2.git
   ```

2. Abrir el proyecto en IntelliJ IDEA.

3. Cargar el proyecto Maven mediante el archivo `pom.xml`.

4. Compilar el proyecto:

   ```bash
   mvn compile
   ```

5. Ejecutar desde IntelliJ IDEA la clase deseada:

   - `Main`: lectura y visualización de empleados.
   - `Main2`: descarga del archivo `employees.tsv`.


## 7. Vídeo explicativo

**Vídeo de la kata:**  FALTA EL ENLACE
