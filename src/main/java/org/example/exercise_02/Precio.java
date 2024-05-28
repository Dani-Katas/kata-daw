package org.example.exercise_02;

import java.util.List;
import java.util.Objects;

public class Precio {
  private final int precio;

  public Precio(final int precio) {
    if (precio < 0) {
      throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    this.precio = precio;
  }

  static Precio calcularMedia(final List<Precio> precios) {
    if (precios.isEmpty()) {
      return Precio.zero();
    }
    int precioTotal = 0;
    for (Precio precio : precios) {
      precioTotal = precioTotal + precio.precio;
    }
    return new Precio(precioTotal / precios.size());
  }

  static Precio zero() {
    return new Precio(0);
  }

  @Override
  public String toString() {
    return String.format("%d,%02d€", precio / 100, precio % 100);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Precio precio1 = (Precio) o;
    return precio == precio1.precio;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(precio);
  }
}
