package org.example.exercise_02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

  private final ArrayList<Libro> libros = new ArrayList<>();

  public void agregarLibro(final Libro libro) {
    this.libros.add(libro);
  }

  void mostrarLibros() {
    System.out.println("Libros en la biblioteca:");
    for (Libro libro : listarLibros()) {
      System.out.println(libro);
    }
  }

  public List<Libro> listarLibros() {
    return this.libros;
  }

  public void eliminarLibro(final int id) {
    this.libros.removeIf(libro -> libro.hasId(id));
  }

  public Precio mediaPrecios() {
    return Libro.mediaPrecios(libros);
  }
}
