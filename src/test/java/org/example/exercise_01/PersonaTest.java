package org.example.exercise_01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

class PersonaTest {
  @Test
  void testToString() {
    Medico medico = new Medico(180, "Pepe", 60, Sexo.HOMBRE, 80, 1000, Especialidad.CARDIOLOGIA);
    Paciente paciente = new Paciente(180, "Juan", 30, Sexo.HOMBRE, 80, new Date(), medico);
    final String medicoString = medico.toString();
    final String pacienteString = paciente.toString();
  }
}