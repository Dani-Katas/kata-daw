package org.example.exercise_01;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

public class BibiliotecaTest {
  @Test
  void addLibros() {
    Biblioteca biblioteca = new Biblioteca();
    Libro libro = new Libro(1, "El Quijote", "Cervantes", "Aventura", 1605);

    biblioteca.agregarLibro(libro);

    List<Libro> libros = biblioteca.listarLibros();
    assertThat(libros.size()).isEqualTo(1);
  }
}
