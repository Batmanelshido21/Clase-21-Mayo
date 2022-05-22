package Main;

import java.util.ArrayList;
import java.util.Scanner;
import Objetos.Materia;
import Objetos.Profesor;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner lector = new Scanner(System.in);
    ArrayList<Materia> materias = new ArrayList();
    ArrayList<Profesor> profesores = new ArrayList();

    String nombreMateria = "";
    String noPersonal = "";
    String nombre = "";
    int bandera = 0;

    while (bandera < 6) {
      System.out.println(
          "Introduce la opción a ejecutar \n1:Registrar materia \n2:Mostrar materias \n3:Registrar Profesor\n4:Mostrar materias de profesor \n5:Mostrar profesores");
      bandera = lector.nextInt();
      switch (bandera) {
        case 1:
          System.out.println("Introduce el nombre de la materia");
          nombreMateria = lector.nextLine();
          nombreMateria = lector.nextLine();
          Materia materia = new Materia(nombreMateria);
          materias.add(materia);
          break;
        case 2:
          for (int i = 0; i < materias.size(); i++) {
            System.out.println(materias.get(i).toString());
          }
          break;

        case 3:
          System.out.println("Introduce el número de personal de profesor");
          noPersonal = lector.nextLine();
          noPersonal = lector.nextLine();
          System.out.println("Introduce el nombre del profesor");
          nombre = lector.nextLine();
          System.out.println("Introduce el peso del profesor");
          int peso = lector.nextInt();
          System.out.println("Introduce la edad del profesor");
          int edad = lector.nextInt();
          Profesor profesor = new Profesor(noPersonal, nombre, materias);
          profesor.setEdad(edad);
          profesor.setPeso(peso);
          profesores.add(profesor);
          break;

        case 4:
          System.out.println("Las materias asignadas al profesor son");
          for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i).getMaterias().toString());
          }
          break;
        case 5:
          for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i).toString());
          }
          break;
      }
    }

  }

}
