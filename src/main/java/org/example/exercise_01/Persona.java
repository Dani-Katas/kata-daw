package org.example.exercise_01;

public class Persona {
  private final String nombre;
  protected final int edad;
  private final Sexo sexo;
  protected final int pesoEnKg;
  protected final int alturaEnCm;

  public Persona(final int alturaEnCm, final String nombre, final int edad, final Sexo sexo, final int pesoEnKg) {
    this.alturaEnCm = alturaEnCm;
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.pesoEnKg = pesoEnKg;
  }

  @Override
  public String toString() {
    return
        "alturaEnCm=" + alturaEnCm +
        ", nombre='" + nombre + '\'' +
        ", edad=" + edad +
        ", sexo=" + sexo +
        ", pesoEnKg=" + pesoEnKg;
  }
}
