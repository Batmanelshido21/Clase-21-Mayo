package Objetos;

import java.util.ArrayList;

public class Profesor extends Persona {

  private String noPersonal;
  private String nombre;
  private ArrayList<Materia> materias;

  public Profesor(String noPersonal, String nombre, ArrayList<Materia> materias) {
    super();
    this.noPersonal = noPersonal;
    this.nombre = nombre;
    this.materias = materias;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNoPersonal() {
    return noPersonal;
  }

  public ArrayList<Materia> getMaterias() {
    return materias;
  }

  @Override
  public String toString() {
    return "Profesor [noPersonal=" + noPersonal + ", nombre=" + nombre + ", getEdad()=" + getEdad()
        + ", getPeso()=" + getPeso() + "]";
  }

}
