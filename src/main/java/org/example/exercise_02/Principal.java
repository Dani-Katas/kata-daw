package org.example.exercise_02;

public class Principal {

  public static void main(String[] args) {
    Libro libro1 = new Libro(1, "El Quijote", "Cervantes", "Aventura", 1605);
    Libro libro2 = new Libro(2, "El Señor de los Anillos", "Tolkien", "Fantasía", 1954);
    Libro libro3 = new Libro(3, "El código Da Vinci", "Dan Brown", "Misterio", 2003);

    Biblioteca biblioteca = new Biblioteca();

    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
    biblioteca.agregarLibro(libro3);

    biblioteca.mostrarLibros();

    System.out.println("Eliminando libro con id 2");
    biblioteca.eliminarLibro(2);

    biblioteca.mostrarLibros();

    arrancarPrograma(biblioteca);
  }

  private static void arrancarPrograma(final Biblioteca biblioteca) {
    mostrarMenu();
    String opcion = leerOpcion();

    while (!opcion.equals("0")) {
      switch (opcion) {
        case "1":
          biblioteca.mostrarLibros();
          break;
        case "2":
          // agregar libro
          agregarLibro(biblioteca);
          break;
        case "3":
          System.out.println("Introduce el id del libro a eliminar:");
          biblioteca.eliminarLibro(leerLibroId());
          break;
        case "4":
          System.out.println("Introduce el id del libro a reservar:");
          biblioteca.eliminarLibro(leerLibroId());
          break;
        case "5":
          System.out.println("La media de precios de los libros es: " + biblioteca.mediaPrecios());
          break;
        default:
          System.out.println("Opción no válida");
          break;
      }
      mostrarMenu();
      opcion = leerOpcion();
      clearConsole();
    }
  }

  private static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  private static void agregarLibro(final Biblioteca biblioteca) {
    System.out.println("Introduce el id del libro:");
    int id = leerLibroId();
    System.out.println("Introduce el nombre del libro:");
    String nombre = System.console().readLine();
    System.out.println("Introduce el autor del libro:");
    String autor = System.console().readLine();
    System.out.println("Introduce el género del libro:");
    String genero = System.console().readLine();
    System.out.println("Introduce el precio del libro (en céntimos):");
    int precio = Integer.parseInt(System.console().readLine());

    Libro libro = new Libro(id, nombre, autor, genero, precio);
    biblioteca.agregarLibro(libro);
  }

  private static void mostrarMenu() {
    System.out.println("Menú:");
    System.out.println("1. Mostrar libros");
    System.out.println("2. Agregar libro");
    System.out.println("3. Eliminar libro");
    System.out.println("4. Reservar libro");
    System.out.println("5. Calcular media de precios");
    System.out.println("0. Salir");
  }

  private static String leerOpcion() {
    return System.console().readLine();
  }

  private static int leerLibroId() {
    return Integer.parseInt(System.console().readLine());
  }
}
