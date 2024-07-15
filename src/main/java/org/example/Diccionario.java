package org.example;

import java.util.HashMap;
import java.util.Random;

public class Diccionario {
  private HashMap<String, String> diccionario;

  // Constructor para inicializar el diccionario con palabras
  public Diccionario() {
    diccionario = new HashMap<>();
    // Inicializamos el diccionario con algunas palabras
    diccionario.put("casa", "house");
    diccionario.put("perro", "dog");
    diccionario.put("gato", "cat");
    diccionario.put("libro", "book");
    diccionario.put("ordenador", "computer");
    diccionario.put("telefono", "phone");
    diccionario.put("sol", "sun");
    diccionario.put("luna", "moon");
    diccionario.put("rojo", "red");
    diccionario.put("azul", "blue");
    diccionario.put("verde", "green");
    diccionario.put("agua", "water");
    diccionario.put("fuego", "fire");
    diccionario.put("cielo", "sky");
    diccionario.put("montaña", "mountain");
    diccionario.put("playa", "beach");
    diccionario.put("papel", "paper");
    diccionario.put("lapiz", "pencil");
    diccionario.put("bolígrafo", "pen");
    diccionario.put("mesa", "table");
  }

  // Método para obtener 5 palabras al azar del diccionario
  public String[] obtenerPalabrasAzar() {
    String[] palabras = new String[5];
    Object[] keys = diccionario.keySet().toArray();
    Random random = new Random();

    for (int i = 0; i < 5; i++) {
      palabras[i] = (String) keys[random.nextInt(keys.length)];
    }

    return palabras;
  }

  // Método para comprobar la traducción de una palabra
  public boolean verificarTraduccion(String palabraEspañol, String respuestaUsuario) {
    String traduccionCorrecta = diccionario.get(palabraEspañol.toLowerCase());
    return traduccionCorrecta != null && traduccionCorrecta.equalsIgnoreCase(respuestaUsuario);
  }

  // Método para obtener la traducción correcta de una palabra
  public String obtenerTraduccion(String palabraEspañol) {
    return diccionario.get(palabraEspañol.toLowerCase());
  }
}

