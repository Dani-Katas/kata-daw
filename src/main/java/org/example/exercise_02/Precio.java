package org.example.exercise_02;

public class Precio {
  private final int precio;

  public Precio(final int precio) {
    if (precio < 0) {
      throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    this.precio = precio;
  }

  public int getPrecio() {
    return precio;
  }

  @Override
  public String toString() {
    return String.format("%d,%02d€", precio / 100, precio % 100);
  }
}
