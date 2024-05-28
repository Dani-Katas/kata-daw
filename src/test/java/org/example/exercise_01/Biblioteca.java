package org.example.exercise_01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Biblioteca {

  private final ArrayList<Libro> libros = new ArrayList<>();

  public void agregarLibro(final Libro libro) {
    this.libros.add(libro);
  }

  public List<Libro> listarLibros() {
    return this.libros;
  }

  public void eliminarLibro(final int id) {
    this.libros.removeIf(libro -> libro.hasId(id));
  }

  public int mediaPrecios() {
    if (libros.isEmpty()) {
      return 0;
    }

    int precioTotal = 0;
    for (Libro libro : libros) {
      precioTotal += libro.getPrecio();
    }
    return precioTotal / libros.size();
  }
}
