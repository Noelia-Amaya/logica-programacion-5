package org.example;

import java.util.Scanner;

public class Logica {
  private Diccionario diccionario;
  private Scanner scanner;

  public Logica() {
    diccionario = new Diccionario();
    scanner = new Scanner(System.in);
  }

  // Método para ejecutar la lógica del programa
  public void ejecutar() {
    int opcion;

    do {
      mostrarMenu();
      opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer de entrada

      switch (opcion) {
        case 1:
          jugar();
          break;
        case 2:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción inválida. Inténtalo de nuevo.");
      }
    } while (opcion != 2);
  }

  // Método para mostrar el menú de opciones
  private void mostrarMenu() {
    System.out.println("\nDICCIONARIO ESPAÑOL - INGLÉS");
    System.out.println("1. Ingrese la traducción al inglés de cada una de las siguientes palabras");
    System.out.println("2. Salir del programa");
    System.out.print("Seleccione una opción: ");
  }

  // Método para jugar y verificar traducciones
  private void jugar() {
    String[] palabras = diccionario.obtenerPalabrasAzar();
    int respuestasCorrectas = 0;
    int respuestasIncorrectas = 0;

    System.out.println("\n¡Adivina la traducción al inglés!");

    for (String palabraEspañol : palabras) {
      System.out.print(palabraEspañol + ": ");
      String respuesta = scanner.nextLine();

      if (diccionario.verificarTraduccion(palabraEspañol, respuesta)) {
        System.out.println("¡Correcto!");
        respuestasCorrectas++;
      } else {
        System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.obtenerTraduccion(palabraEspañol));
        respuestasIncorrectas++;
      }
    }

    System.out.println("\nResumen del juego:");
    System.out.println("Respuestas correctas: " + respuestasCorrectas);
    System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
  }

  // Método principal para iniciar el programa
  public static void main(String[] args) {
    Logica logica = new Logica();
    logica.ejecutar();
  }
}
