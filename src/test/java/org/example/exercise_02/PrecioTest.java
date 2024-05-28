package org.example.exercise_02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrecioTest {
  @Test
  void lanzaUnaExepcionSiElPrecioEsNegativo() {
    assertThrows(IllegalArgumentException.class, () -> new Precio(-1));
  }

  @Test
  void muestraElPrecioEnEuros() {
    Precio precio = new Precio(1605);

    final String precioEuros = precio.toString();

    assertThat(precioEuros).isEqualTo("16,05€");
  }
}