package org.example.exercise_01;

public class Medico extends Persona {

  private final int precioConsultaEnCentimos;

  private final Especialidad especialidad;

  public Medico(final int alturaEnCm, final String nombre, final int edad, final Sexo sexo, final int pesoEnKg,
      final int precioConsultaEnCentimos, final Especialidad especialidad) {
    super(alturaEnCm, nombre, edad, sexo, pesoEnKg);
    this.precioConsultaEnCentimos = precioConsultaEnCentimos;
    this.especialidad = especialidad;
  }

  @Override
  public String toString() {
    return "Medico{" +
        "especialidad=" + especialidad +
        ", precioConsultaEnCentimos=" + precioConsultaEnCentimos +
        ", " + super.toString() +
        '}';
  }
}
