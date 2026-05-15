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

Proyecto académico — Universidad Técnica de Ambato. Uso educativo.
