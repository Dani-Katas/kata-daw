package org.example.exercise_02;

import java.util.ArrayList;
import java.util.List;

public class Libro {

  private final int id;

  private final String nombre;

  private final String autor;

  private final String genero;

  private final Precio precio;

  public Libro(final int id, final String nombre, final String autor, final String genero, final int precio) {
    this.id = id;
    this.nombre = nombre;
    this.autor = autor;
    this.genero = genero;
    this.precio = new Precio(precio);
  }

  static Precio mediaPrecios(final List<Libro> libros) {
    ArrayList<Precio> precios = new ArrayList<>();
    for (Libro libro : libros) {
      precios.add(libro.precio);
    }
    return Precio.calcularMedia(precios);
  }

  public boolean hasId(final int id) {
    return this.id == id;
  }

  @Override
  public String toString() {
    return "Libro{" +
        "id=" + id +
        ", nombre='" + nombre + '\'' +
        ", autor='" + autor + '\'' +
        ", genero='" + genero + '\'' +
        ", precio=" + precio +
        '}';
  }
}
