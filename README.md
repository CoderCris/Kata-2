# Histogram

Este proyecto es un **kata** realizado como ejercicio de práctica personal en Java. Su propósito es construir un programa que reciba un conjunto de números enteros y genere un histograma que muestre la frecuencia de aparición de cada número.

## Descripción

La clase `Integers` permite al usuario ingresar un conjunto de números enteros, procesarlos para calcular su frecuencia y mostrar un histograma en consola. Este programa es un ejemplo práctico de manipulación de datos con estructuras clave como **arreglos** y **mapas** en Java.

## Funcionalidades

1. **Entrada de datos**:
   - Solicita al usuario el tamaño de un arreglo y los valores individuales de cada elemento.
   - Valida que las entradas sean números enteros.

2. **Procesamiento de datos**:
   - Calcula la frecuencia de aparición de cada número en el arreglo.
   - Almacena las frecuencias en un `HashMap` donde:
     - La **clave** es el número ingresado.
     - El **valor** es la cantidad de veces que aparece ese número.

3. **Salida de datos**:
   - Imprime en consola el histograma con cada número y su frecuencia.

## Métodos Principales

1. **`initialize()`**: Método principal que organiza el flujo del programa en tres etapas:
   - `input()`: Solicita y almacena los datos del usuario.
   - `procedure()`: Calcula las frecuencias de los números usando un mapa.
   - `output()`: Muestra el histograma resultante en la consola.

2. **Validaciones**:
   - Comprueba que el tamaño del arreglo y los elementos ingresados sean números enteros válidos.

3. **Procesamiento del Histograma**:
   - Usa un `HashMap` para agrupar los números y contar sus apariciones.

## Ejecución

1. Compila y ejecuta el programa.
2. Introduce el tamaño del arreglo y los números solicitados en consola.
3. Observa el histograma generado con la frecuencia de cada número.

### Ejemplo de Ejecución
```text
Tamaño del vector:
5
Introduzca elemento número:1
3
Introduzca elemento número:2
2
Introduzca elemento número:3
3
Introduzca elemento número:4
4
Introduzca elemento número:5
2

Valor: 3 Repeticiones: 2
Valor: 2 Repeticiones: 2
Valor: 4 Repeticiones: 1
```

## Propósito

Este proyecto refuerza conceptos fundamentales en Java, como:
- Uso de arreglos y mapas (`HashMap`).
- Validación de entradas del usuario.
- Procesamiento y agrupamiento de datos.

## Posibles Mejoras
- Permitir al usuario guardar los resultados en un archivo.
- Representar el histograma gráficamente (por ejemplo, con barras ASCII).
- Mejorar la interfaz de usuario con una librería gráfica.

