package org.example.exercise_02;

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

  public boolean hasId(final int id) {
    return this.id == id;
  }

  public int getPrecio() {
    return precio.getPrecio();
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
