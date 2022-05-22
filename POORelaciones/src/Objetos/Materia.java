package Objetos;

import java.util.ArrayList;

public class Materia {

  private String nombreMateria;

  private ArrayList<Profesor> profesores;

  public Materia(String nombreMateria, ArrayList<Profesor> profesores) {
    super();
    this.nombreMateria = nombreMateria;
    this.profesores = profesores;
  }

  public Materia(String nombreMateria) {
    super();
    this.nombreMateria = nombreMateria;
  }

  public String getNombreMateria() {
    return nombreMateria;
  }

  public void modificarMateria(String nombreMateria) {
    this.nombreMateria = nombreMateria;
  }

  @Override
  public String toString() {
    return "Materia [nombreMateria=" + nombreMateria + "]";
  }


}
