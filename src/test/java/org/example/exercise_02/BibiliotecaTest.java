package org.example.exercise_02;

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
    assertThat(libros).hasSize(1);
  }

  @Test
  void eliminarLibro() {
    Biblioteca biblioteca = new Biblioteca();
    Libro libro = new Libro(1, "El Quijote", "Cervantes", "Aventura", 1605);
    biblioteca.agregarLibro(libro);

    biblioteca.eliminarLibro(1);

    List<Libro> libros = biblioteca.listarLibros();
    assertThat(libros).hasSize(0);
  }

  @Test
  void eliminarLibroYDejarElResto() {
    Biblioteca biblioteca = new Biblioteca();
    Libro libro1 = new Libro(1, "El Quijote", "Cervantes", "Aventura", 1605);
    Libro libro2 = new Libro(2, "El Señor de los Anillos", "Tolkien", "Fantasía", 1954);
    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);

    biblioteca.eliminarLibro(1);

    List<Libro> libros = biblioteca.listarLibros();
    assertThat(libros).hasSize(1);
  }

  @Test
  void calcularMediaPrecio() {
    Biblioteca biblioteca = new Biblioteca();
    Libro libro1 = new Libro(1, "El Quijote", "Cervantes", "Aventura", 1000);
    Libro libro2 = new Libro(2, "El Señor de los Anillos", "Tolkien", "Fantasía", 2000);
    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);

    int mediaPrecios = biblioteca.mediaPrecios();

    assertThat(mediaPrecios).isEqualTo(1500);
  }

  @Test
  void laMediaDaCeroSiNoHayLibros() {
    Biblioteca biblioteca = new Biblioteca();

    int mediaPrecios = biblioteca.mediaPrecios();

    assertThat(mediaPrecios).isEqualTo(0);
  }
}
