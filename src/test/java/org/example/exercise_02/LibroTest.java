package org.example.exercise_02;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroTest {
  @Test
  void lanzaUnaExepcionSiElPrecioEsNegativo() {
    assertThrows(IllegalArgumentException.class, () -> new Libro(1, "El Quijote", "Cervantes", "Aventura", -1));
  }

  @Test
  void muestraTodaLaInformacionEnString() {
    Libro libro = new Libro(1, "El Quijote", "Cervantes", "Aventura", 1605);

    final String libroString = libro.toString();

    assertThat(libroString).isEqualTo("Libro{id=1, nombre='El Quijote', autor='Cervantes', genero='Aventura', precio=16,05€}");
  }
}
