package org.example.exercise_01;

public class Libro {

  private final int id;

  private final String nombre;

  private final String autor;

  private final String genero;

  private final int precio;

  public Libro(final int id, final String nombre, final String autor, final String genero, final int precio) {
    if (precio < 0) {
      throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    this.id = id;
    this.nombre = nombre;
    this.autor = autor;
    this.genero = genero;
    this.precio = precio;
  }

  public boolean hasId(final int id) {
    return this.id == id;
  }

  public int getPrecio() {
    return precio;
  }
}
