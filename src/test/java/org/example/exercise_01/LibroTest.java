package org.example.exercise_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibroTest {
  @Test
  void lanzaUnaExepcionSiElPrecioEsNegativo() {
    assertThrows(IllegalArgumentException.class, () -> new Libro(1, "El Quijote", "Cervantes", "Aventura", -1));
  }
}
