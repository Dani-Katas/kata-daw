package org.example.exercise_01;

import java.util.Date;

public class Paciente extends Persona {

  private final Date fechaPrimeraConsulta;

  private final Medico medicoAsignado;

  public Paciente(final int alturaEnCm, final String nombre, final int edad, final Sexo sexo, final int pesoEnKg,
      final Date fechaPrimeraConsulta, final Medico medicoAsignado) {
    super(alturaEnCm, nombre, edad, sexo, pesoEnKg);
    this.fechaPrimeraConsulta = fechaPrimeraConsulta;
    this.medicoAsignado = medicoAsignado;
  }

  /**
   * Devolverá un -1 si está por debajo de su peso ideal, un 0 si se encuentra en su peso y un 1 si tiene sobrepeso
   */
  int estaEnPesoIdeal() {
    double pesoIdeal = this.alturaEnCm - 110;
    if (this.pesoEnKg < pesoIdeal) {
      return -1;
    } else if (this.pesoEnKg == pesoIdeal) {
      return 0;
    } else {
      return 1;
    }
  }

  boolean esMayorDeEdad() {
    return this.edad >= 18;
  }

  @Override
  public String toString() {
    return "Paciente{" +
        "fechaPrimeraConsulta=" + fechaPrimeraConsulta + ", medicoAsignado=" + medicoAsignado + ", " + super.toString() + '}';
  }
}
