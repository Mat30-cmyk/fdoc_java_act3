package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main programa = new Main();
        int op;

        do {
            System.out.println("\n===== MENÚ DE EJERCICIOS =====");
            System.out.println("1. Ejercicio 1: Creación y Operaciones Básicas con ArrayList");
            System.out.println("2. Ejercicio 2: Eliminación de Elementos");
            System.out.println("3. Ejercicio 3: Recorrido con For Tradicional");
            System.out.println("4. Ejercicio 4: Recorrido con For-Each");
            System.out.println("5. Ejercicio 5: Uso de Iterator para Eliminación Segura");
            System.out.println("6. Ejercicio 6: Métodos de Búsqueda");
            System.out.println("7. Ejercicio 7: Ordenamiento de ArrayList");
            System.out.println("8. Ejercicio 8: Operaciones con removeIf");
            System.out.println("9. Ejercicio 9: Conversión a Arreglo");
            System.out.println("10. Ejercicio 10: Mini-Proyecto - Sistema de Gestión de Estudiantes");
            System.out.println("11. Salir");
            System.out.print("\nSeleccione una opción: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    programa.ejercicio1();
                    break;
                case 2:
                    programa.ejercicio2();
                    break;
                case 3:
                    programa.ejercicio3();
                    break;
                case 4:
                    programa.ejercicio4();
                    break;
                case 5:
                    programa.ejercicio5();
                    break;
                case 6:
                    programa.ejercicio6();
                    break;
                case 7:
                    programa.ejercicio7();
                    break;
                case 8:
                    programa.ejercicio8();
                    break;
                case 9:
                    programa.ejercicio9();
                    break;
                case 10:
                    programa.ejercicio10();
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (op != 11);

        scanner.close();
    }

    public void ejercicio1() {
        System.out.println("\nEjecutando ejercicio 1...");

        // Crear la lista de frutas
        List<String> frutas = new ArrayList<>();

        // Añadir frutas
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");

        // Imprimir toda la lista
        System.out.println("\nLista completa de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // Insertar "Uva" en la posición 2
        frutas.add(2, "Uva");

        // Imprimir toda la lista
        System.out.println("\nLista completa de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // Obtener y mostrar la primera fruta
        String primera = frutas.get(0);
        System.out.println("Primera fruta: " + primera);

        // Modificar posición 3 con "Kiwi"
        frutas.set(3, "Kiwi");

        // Mostrar tamaño de la lista
        System.out.println("Tamaño de la lista: " + frutas.size());

        // Imprimir toda la lista
        System.out.println("\nLista completa de frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        System.out.println("\nEjercicio 1 completado.\n");
    }

    public void ejercicio2() {
        System.out.println("\nEjecutando ejercicio 2...\n");

        // Crear ArrayList con los números indicados
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(20); // repetido

        System.out.println("Lista inicial: " + numeros);

        // Eliminar elemento en la posición 2 (el número 30)
        numeros.remove(2);
        System.out.println("Después de eliminar posición 2: " + numeros);

        // Eliminar primera aparición del número 20
        numeros.remove(1);
        System.out.println("Después de eliminar la primera aparición de 20: " + numeros);

        // Verificar si la lista contiene el número 40
        boolean contiene40 = numeros.contains(40);
        System.out.println("¿La lista contiene el número 40?: " + contiene40);

        // Mostrar tamaño final
        System.out.println("Tamaño final de la lista: " + numeros.size());

        // Imprimir lista resultante
        System.out.println("\nLista final resultante:");
        for (int n : numeros) {
            System.out.println("- " + n);
        }

        System.out.println("\nEjercicio 2 completado.\n");
    }

    public void ejercicio3() {
        System.out.println("\nEjecutando ejercicio 3...\n");

        // Crear ArrayList de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Elena");

        // Recorrer con for tradicional
        System.out.println("Recorriendo la lista:");
        int contador = 0;

        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println("Posición " + (i + 1) + ": " + nombre);

            // Contar nombres con más de 4 caracteres
            if (nombre.length() > 4) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("\nCantidad de nombres con más de 4 caracteres: " + contador);

        System.out.println("\nEjercicio 3 completado.\n");
    }

    public void ejercicio4() {
        System.out.println("\nEjecutando ejercicio 4...\n");

        // Crear ArrayList de valores Double
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(15.5);
        valores.add(23.8);
        valores.add(9.2);
        valores.add(31.7);
        valores.add(12.4);

        // Variables para cálculos
        double suma = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        // Recorrer la lista con for-each
        for (double valor : valores) {
            suma += valor;

            if (valor > max) {
                max = valor;
            }
            if (valor < min) {
                min = valor;
            }
        }

        // Calcular promedio
        double promedio = suma / valores.size();

        // Mostrar resultados
        System.out.println("Valores: " + valores);
        System.out.println("Suma total: " + suma);
        System.out.println("Valor máximo: " + max);
        System.out.println("Valor mínimo: " + min);
        System.out.println("Promedio: " + promedio);

        System.out.println("\nEjercicio 4 completado.\n");
    }

    public void ejercicio5() {
        System.out.println("\nEjecutando ejercicio 5...\n");

        // Crear ArrayList con números del 1 al 10
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Lista original: " + numeros);

        // Lista temporal para almacenar pares que serán eliminados
        ArrayList<Integer> eliminar = new ArrayList<>();

        // Recorrer la lista y detectar números pares
        for (int n : numeros) {
            if (n % 2 == 0) {
                eliminar.add(n);
            }
        }

        // Contador de eliminados
        int eliminados = eliminar.size();

        // Eliminar los números pares identificados
        for (int n : eliminar) {
            numeros.remove(Integer.valueOf(n));
        }

        // Mostrar resultados
        System.out.println("Lista después de eliminar números pares: " + numeros);
        System.out.println("Cantidad de elementos eliminados: " + eliminados);

        System.out.println("\nEjercicio 5 completado.\n");
    }

    public void ejercicio6() {
        System.out.println("\nEjecutando ejercicio 6...\n");

        // Crear ArrayList de cadenas
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C++");
        lenguajes.add("JavaScript");
        lenguajes.add("Python");
        lenguajes.add("Go");

        // Imprimir toda la lista
        System.out.println("Lista completa de lenguajes de programación:");
        for (String lenguaje : lenguajes) {
            System.out.println("- " + lenguaje);
        }

        // Búsquedas
        int primeraPython = lenguajes.indexOf("Python");
        int ultimaPython = lenguajes.lastIndexOf("Python");
        boolean contieneRuby = lenguajes.contains("Ruby");

        // Sublista del índice 1 al 4 (4 no incluido)
        List<String> sublista = lenguajes.subList(1, 4);

        // Resultados
        System.out.println("Lista: " + lenguajes);
        System.out.println("Primer índice de 'Python': " + primeraPython);
        System.out.println("Último índice de 'Python': " + ultimaPython);
        System.out.println("¿Contiene 'Ruby'?:" + contieneRuby);
        System.out.println("Sublista (índices 1 a 3): " + sublista);

        System.out.println("\nEjercicio 6 completado.\n");

    }

    public void ejercicio7() {
        System.out.println("\nEjecutando ejercicio 7...\n");

        // lista de enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(78);
        numeros.add(23);
        numeros.add(67);
        numeros.add(34);
        numeros.add(89);
        numeros.add(56);

        // imprimir la lista original
        System.out.println("Lista completa de numeros:");
        for (int numero : numeros) {
            System.out.println("- " + numero);
        }

        // Orden ascendente
        Collections.sort(numeros);
        System.out.println("Orden ascendente: " + numeros);

        // Orden descendente
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("Orden descendente: " + numeros);

        // Ordenar strings
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("María");
        nombres.add("Carlos");
        nombres.add("Elena");

        // Alfabético
        Collections.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente: " + nombres);

        // Por longitud
        Collections.sort(nombres, (a, b) -> a.length() - b.length());
        System.out.println("Nombres ordenados por longitud: " + nombres);

        System.out.println("\nEjercicio 7 completado.\n");
    }

    public void ejercicio8() {
        System.out.println("\nEjecutando ejercicio 8...\n");

        // Lista de palabras
        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("casa");
        palabras.add("auto");
        palabras.add("bicicleta");
        palabras.add("avión");
        palabras.add("barco");
        palabras.add("tren");

        // lista original de palabras
        System.out.println("\nLista completa de palabras:");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        // Eliminar palabras con menos de 5 caracteres
        palabras.removeIf(p -> p.length() < 5);
        System.out.println("Después de eliminar <5 caracteres: ");
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        // Lista de números 1–20
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numeros.add(i);
        }

        System.out.println("Lista original números 1 - 20: " + numeros);

        // Eliminar divisibles por 3
        numeros.removeIf(n -> n % 3 == 0);
        System.out.println("Después de eliminar divisibles por 3: " + numeros);

        System.out.println("\nEjercicio 8 completado.\n");
    }

    public void ejercicio9() {
        System.out.println("\nEjecutando ejercicio 9...\n");

        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");

        // toArray()
        Object[] arregloObject = dias.toArray();
        String[] arregloString = dias.toArray(new String[0]);

        // Mostrar longitudes
        System.out.println("Longitud arreglo Object: " + arregloObject.length);
        System.out.println("Longitud arreglo String: " + arregloString.length);

        // Recorrer ambos arreglos
        System.out.println("\nElementos arreglo Object:");
        for (Object o : arregloObject) {
            System.out.println(o);
        }

        System.out.println("\nElementos arreglo String:");
        for (String s : arregloString) {
            System.out.println(s);
        }

        // Crear ArrayList desde arreglo
        String[] original = { "Uno", "Dos", "Tres" };
        ArrayList<String> desdeArray = new ArrayList<>(Arrays.asList(original));
        System.out.println("\nArrayList creado desde arreglo: " + desdeArray);

        System.out.println("\nEjercicio 9 completado.\n");
    }

    public void ejercicio10() {
        System.out.println("\nEjecutando ejercicio 10...\n");

        // Crear ArrayLists vacíos
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        // Datos de prueba
        agregarEstudiante(nombres, notas, "Ana", 4.5);
        agregarEstudiante(nombres, notas, "Luis", 2.8);
        agregarEstudiante(nombres, notas, "María", 3.7);
        agregarEstudiante(nombres, notas, "Carlos", 4.2);
        agregarEstudiante(nombres, notas, "Elena", 2.5);

        // Listar
        listarEstudiantes(nombres, notas);

        // Promedio
        double promedio = calcularPromedio(notas);
        System.out.println("\nPromedio general: " + promedio);

        // Aprobados
        estudiantesAprobados(nombres, notas);

        // Eliminar estudiante en posición 1
        eliminarEstudiante(nombres, notas, 1);

        // Buscar a María
        int indiceMaria = buscarEstudiante(nombres, "María");
        System.out.println("\nPosición de María: " + (indiceMaria + 1));

        // Listar final
        listarEstudiantes(nombres, notas);

        System.out.println("\nEjercicio 10 completado.\n");
    }

    // ====== MÉTODOS AUXILIARES ======
    public void agregarEstudiante(ArrayList<String> nombres, ArrayList<Double> notas, String nombre, Double nota) {
        nombres.add(nombre);
        notas.add(nota);
    }

    public void eliminarEstudiante(ArrayList<String> nombres, ArrayList<Double> notas, int indice) {
        if (indice >= 0 && indice < nombres.size()) {
            nombres.remove(indice);
            notas.remove(indice);
        }
    }

    public int buscarEstudiante(ArrayList<String> nombres, String nombre) {
        return nombres.indexOf(nombre);
    }

    public double calcularPromedio(ArrayList<Double> notas) {
        double suma = 0;
        for (double n : notas)
            suma += n;
        return suma / notas.size();
    }

    public void listarEstudiantes(ArrayList<String> nombres, ArrayList<Double> notas) {
        System.out.println("\nListado de Estudiantes:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i) + " - " + notas.get(i));
        }
    }

    public void estudiantesAprobados(ArrayList<String> nombres, ArrayList<Double> notas) {
        System.out.println("\nEstudiantes aprobados:");
        for (int i = 0; i < nombres.size(); i++) {
            if (notas.get(i) >= 3.0) {
                System.out.println(nombres.get(i) + " - " + notas.get(i));
            }
        }
    }
}
