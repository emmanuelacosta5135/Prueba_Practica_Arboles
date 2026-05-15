# 🌳 prueba-practica-arboles-cpp-java

**Universidad Técnica de Ambato — Facultad de Ingeniería en Sistemas**  
**Asignatura:** Estructura de Datos  
**Tema:** Árboles Binarios de Búsqueda — Gestión de Estudiantes  
**Lenguajes:** C++ · Java  

---

## 📋 Descripción

Sistema académico que gestiona estudiantes de la Universidad Técnica de Ambato mediante un **Árbol Binario de Búsqueda (BST)**. Cada nodo almacena: cédula, apellidos, nombres, nota final, carrera y nivel.

El proyecto está implementado en **dos lenguajes** de forma paralela:

| Aspecto | C++ | Java |
|---------|-----|------|
| Archivo | `arbol_estudiantes.cpp` | `ArbolEstudiantes.java` |
| Paradigma | Estructurado + OOP | OOP pura |
| Punteros | Punteros nativos (`Nodo*`) | Referencias de objeto |
| Cola BFS | `std::queue` | `java.util.LinkedList` |

---

## 📁 Estructura del Repositorio

```
prueba-practica-arboles-cpp-java/
│
├── cpp/
│   └── arbol_estudiantes.cpp     # Implementación C++
│
├── java/
│   └── ArbolEstudiantes.java     # Implementación Java
│
├── capturas/                     # Evidencias de ejecución
│   ├── cpp_menu.png
│   ├── cpp_inorden.png
│   ├── java_menu.png
│   └── java_bfs.png
│
└── README.md
```

---

## ⚙️ Compilación y Ejecución

### C++

**Requisitos:** g++ (GCC 7+) o cualquier compilador C++11.

```bash
# Compilar
g++ -std=c++11 -o arbol arbol_estudiantes.cpp

# Ejecutar (Linux/macOS)
./arbol

# Ejecutar (Windows)
arbol.exe
```

### Java

**Requisitos:** JDK 11 o superior.

```bash
# Compilar
javac ArbolEstudiantes.java

# Ejecutar
java ArbolEstudiantes
```

---

## 🗂️ Funciones Implementadas

| # | Función | Descripción |
|---|---------|-------------|
| 1 | `insertarEstudiante()` | Inserta un nodo en el BST ordenado por cédula |
| 2 | `buscarEstudiante()` | Búsqueda O(log n) por cédula |
| 3 | `eliminarEstudiante()` | Eliminación con sucesor inorden |
| 4 | `recorridoInorden()` | Izq → Raíz → Der (orden ascendente de cédulas) |
| 5 | `recorridoPreorden()` | Raíz → Izq → Der |
| 6 | `recorridoPostorden()` | Izq → Der → Raíz |
| 7 | `recorridoPorNiveles()` | BFS usando cola, nivel por nivel |
| 8 | `contarNodos()` | Total de estudiantes registrados |
| 9 | `calcularAltura()` | Altura máxima del árbol |
| 10 | `buscarNotaMayor()` | Estudiante con la nota más alta |
| 11 | `buscarNotaMenor()` | Estudiante con la nota más baja |
| 12 | `mostrarAprobados()` | Estudiantes con nota ≥ 14 |
| 13 | `mostrarReprobados()` | Estudiantes con nota < 14 |

---

## 🌲 Conceptos de Árboles BST

### ¿Qué es un BST?

Un **Árbol Binario de Búsqueda** es una estructura de datos donde:
- Cada nodo tiene como máximo **dos hijos** (izquierdo y derecho).
- Los nodos del **subárbol izquierdo** tienen clave **menor** que la raíz.
- Los nodos del **subárbol derecho** tienen clave **mayor** que la raíz.

En este proyecto la clave de ordenamiento es la **cédula** del estudiante.

### Tipos de Recorrido

```
        1804000003
       /            \
  1804000001     1804000005
       \           /
   1804000002  1804000004
```

| Recorrido | Orden de visita | Resultado (cédulas) |
|-----------|----------------|---------------------|
| Inorden | Izq → Raíz → Der | 001, 002, 003, 004, 005 |
| Preorden | Raíz → Izq → Der | 003, 001, 002, 005, 004 |
| Postorden | Izq → Der → Raíz | 002, 001, 004, 005, 003 |
| BFS | Nivel por nivel | 003 → 001, 005 → 002, 004 |

---

## 📊 Complejidades

| Operación | Caso Promedio | Peor Caso |
|-----------|--------------|-----------|
| Insertar | O(log n) | O(n) |
| Buscar | O(log n) | O(n) |
| Eliminar | O(log n) | O(n) |
| Recorridos | O(n) | O(n) |
| Altura | O(n) | O(n) |

> El peor caso O(n) ocurre cuando el árbol se degrada en lista (inserción ordenada).

---

## ✅ Reglas de Validación

- La **cédula** es la clave única del BST; no se permiten duplicados.
- La **nota final** debe estar en el rango **0.00 – 20.00**.
- Un estudiante se considera **aprobado** si su nota es ≥ 14.

---

## 📸 Evidencias

Las capturas de pantalla de ejecución se encuentran en la carpeta `/capturas/`.

---

## 👨‍💻 Autor

**Nombre del estudiante** — Universidad Técnica de Ambato  
Materia: Estructura de Datos  
Período académico: 2024-2025

---

## 📄 Licencia

- Capturas
<img width="407" height="497" alt="Captura de pantalla 2026-05-15 080413" src="https://github.com/user-attachments/assets/2acf51d3-29ff-406f-995a-cd45607f44d0" />
<img width="472" height="590" alt="Captura de pantalla 2026-05-15 080443" src="https://github.com/user-attachments/assets/64ef61cc-100e-40a4-a27b-34d3c3d2b38c" />
<img width="347" height="846" alt="Captura de pantalla 2026-05-15 080511" src="https://github.com/user-attachments/assets/f3c13d8a-7a6e-4e2f-9bf1-eb2fb549ac56" />
<img width="500" height="853" alt="Captura de pantalla 2026-05-15 080531" src="https://github.com/user-attachments/assets/f99416fe-8164-47a4-92fd-3382285a5fd2" />
<img width="492" height="817" alt="Captura de pantalla 2026-05-15 080552" src="https://github.com/user-attachments/assets/dceab5c1-0d6c-46cd-8fe7-076be950cb96" />
<img width="487" height="812" alt="Captura de pantalla 2026-05-15 080608" src="https://github.com/user-attachments/assets/088185ac-0bc3-44ff-b9e8-a3bc6212ed0f" />
<img width="501" height="681" alt="Captura de pantalla 2026-05-15 080630" src="https://github.com/user-attachments/assets/0e0126f2-78d8-4f55-af19-40d09b99f98a" />
<img width="497" height="768" alt="Captura de pantalla 2026-05-15 080646" src="https://github.com/user-attachments/assets/c32857e0-6e30-48b2-b7e5-463952974bd0" />
<img width="510" height="847" alt="Captura de pantalla 2026-05-15 080705" src="https://github.com/user-attachments/assets/7b50b160-874c-42af-86e2-f3ec98b829ac" />
<img width="292" height="533" alt="Captura de pantalla 2026-05-15 080719" src="https://github.com/user-attachments/assets/42dc14dc-f4d7-4cfa-9211-3bf78280b4ad" />


- Explicacion del codigo y como ejecutarlo:
1. Estructura correcta del proyecto

El proyecto debe estar organizado en varios archivos .java, ya que el código fue dividido en clases separadas. La estructura recomendada es la siguiente:

ProyectoArbolBST/
│
├── Main.java
├── ArbolBST.java
├── Nodo.java
└── Estudiante.java

Cada archivo contiene una clase diferente:

Estudiante.java → almacena la información del estudiante.
Nodo.java → representa cada nodo del árbol.
ArbolBST.java → contiene toda la lógica del árbol binario de búsqueda.
Main.java → contiene el menú principal y la ejecución del programa.

Todos los archivos deben estar en la misma carpeta para evitar problemas de compilación.

2. Explicación de cada archivo
Estudiante.java

Esta clase funciona como un modelo de datos. Su propósito es guardar toda la información académica de un estudiante:

String cedula;
String apellidos;
String nombres;
double notaFinal;
String carrera;
int nivel;

Cada objeto de tipo Estudiante representa un registro completo dentro del sistema.

Por ejemplo:

Estudiante e = new Estudiante(
    "1801",
    "Lopez",
    "Carlos",
    18.5,
    "Sistemas",
    3
);

Esto crea un estudiante con todos sus datos cargados en memoria.

Nodo.java

La clase Nodo representa cada nodo del árbol binario.

Cada nodo tiene:

Estudiante datos;
Nodo izq;
Nodo der;
datos → contiene el estudiante.
izq → apunta al hijo izquierdo.
der → apunta al hijo derecho.

El árbol funciona enlazando nodos mediante referencias.

Visualmente:

        [1803]
        /    \
    [1801]  [1805]

Cada cuadro es un objeto Nodo.

ArbolBST.java

Esta es la clase principal del sistema porque implementa toda la lógica del Árbol Binario de Búsqueda.

Aquí se encuentran las operaciones importantes:

Insertar estudiantes
insertarEstudiante()

Inserta un nuevo nodo respetando las reglas del BST:

menores a la izquierda
mayores a la derecha

Ejemplo:

Insertar 50
Insertar 30
Insertar 70

Resultado:

      50
     /  \
   30    70
Buscar estudiantes
buscarEstudiante()

Busca una cédula específica recorriendo el árbol.

La búsqueda es eficiente porque no revisa todos los nodos; solo sigue el camino correcto.

Eliminar estudiantes
eliminarEstudiante()

Elimina nodos manejando los tres casos clásicos:

Nodo hoja.
Nodo con un hijo.
Nodo con dos hijos.

Cuando existen dos hijos, utiliza el sucesor inorden.

Recorridos

El árbol implementa varios recorridos:

Inorden
Izquierda → Raíz → Derecha

Produce datos ordenados por cédula.

Preorden
Raíz → Izquierda → Derecha

Útil para clonar árboles.

Postorden
Izquierda → Derecha → Raíz

Útil para liberar memoria o eliminar árboles.

BFS
Recorrido por niveles

Usa una cola (Queue) para recorrer nivel por nivel.

Altura del árbol
calcularAltura()

Calcula cuántos niveles tiene el árbol.

Ejemplo:

       50
      /  \
    30    70

Altura = 2.

Main.java

Es el archivo principal del programa.

Contiene:

public static void main(String[] args)

Desde aquí inicia toda la ejecución.

También contiene:

el menú interactivo
lectura de datos
control de opciones
interacción con el usuario
3. Cómo compilar el proyecto

Abre una terminal dentro de la carpeta donde están los archivos.

Ejemplo:

ProyectoArbolBST/

En VS Code puedes abrir la terminal con:

Terminal → New Terminal

o con:

Ctrl + ñ

Luego ejecuta:

javac *.java

Este comando compila todos los archivos Java del directorio.

Si todo funciona correctamente, aparecerán archivos .class:

Main.class
ArbolBST.class
Nodo.class
Estudiante.class

Estos archivos son el código compilado que la JVM puede ejecutar.

4. Cómo ejecutar el programa

Una vez compilado, ejecuta:

java Main

IMPORTANTE:

NO se escribe .java
SOLO el nombre de la clase principal

Correcto:

java Main

Incorrecto:

java Main.java
5. Funcionamiento del menú

Al ejecutar el programa aparecerá algo similar:

========= MENU =========
1. Insertar
2. Buscar
3. Eliminar
4. Inorden
5. Preorden
6. Postorden
7. BFS
8. Contar nodos
9. Altura
10. Salir

Cada opción ejecuta una operación distinta del BST.

6. Ejemplo completo de uso
Insertar estudiantes

Selecciona:

1

Luego ingresa:

Cedula: 1801
Apellidos: Lopez
Nombres: Carlos
Nota: 18
Carrera: Sistemas
Nivel: 3

El sistema crea el nodo y lo inserta en el árbol.

Mostrar Inorden

Selecciona:

4

Resultado:

1801
1802
1803

Los datos aparecen ordenados automáticamente.

Buscar estudiante

Selecciona:

2

Ingresa la cédula:

1801

El árbol recorrerá únicamente el camino necesario.

BFS

Selecciona:

7

El sistema mostrará:

Nivel 1
Nivel 2
Nivel 3

Mostrando cómo se recorre el árbol por niveles.

7. Errores comunes
Error: class X is public, should be declared in a file named X.java

Ocurre cuando el nombre del archivo no coincide con la clase pública.

Ejemplo incorrecto:

Archivo: Main.java
Clase pública: ArbolEstudiantes

Solución:

cambiar el nombre del archivo
o
cambiar el nombre de la clase

Deben coincidir exactamente.

Error: Could not find or load main class

Sucede cuando:

no compilaste el proyecto
estás en otra carpeta
escribiste mal el nombre

Solución:

javac *.java
java Main
Error: Exception in thread "main"

Generalmente ocurre por:

entradas inválidas
conversiones incorrectas
variables nulas

Por eso el programa usa validaciones con try-catch.

8. Cómo ejecutarlo en VS Code
Instalar extensiones

Instala:

Extension Pack for Java
Language Support for Java
Abrir carpeta
File → Open Folder

Selecciona la carpeta del proyecto.

Ejecutar

Abre Main.java.

Presiona:

▶ Run

o:

Ctrl + F5
9. Cómo ejecutarlo en IntelliJ IDEA
Crear proyecto Java.
Copiar todos los .java.
Esperar indexación.
Abrir Main.java.
Presionar botón verde ▶.
