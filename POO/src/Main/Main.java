package Main;

import java.util.ArrayList;
import java.util.Scanner;
import Objetos.Empleado;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner lector = new Scanner(System.in);
    ArrayList<Empleado> empleados = new ArrayList();
    String nombre = "";
    String apellido = "";
    double salarioMensual = 0;

    int bandera = 0;
    while (bandera < 4) {
      System.out.println(
          "Introduce la opcion a realizar \n 1:Registrar usuario \n 2:Mostrar empleados \n 3:Aumentar salario");
      bandera = lector.nextInt();

      switch (bandera) {
        case 1:
          System.out.println("Introduce el nombre del empleado");
          nombre = lector.nextLine();
          nombre = lector.nextLine();
          System.out.println("Introduce el apellido del empleado");
          apellido = lector.nextLine();
          System.out.println("Introduce el salario mensual del empleado");
          salarioMensual = lector.nextDouble();
          Empleado empleado = new Empleado(nombre, apellido, salarioMensual);
          empleados.add(empleado);

          break;
        case 2:

          for (int i = 0; i < empleados.size(); i++) {
            System.out.println(empleados.get(i).toString());
          }

          break;

        case 3:
          System.out.println("Introduce el nombre del empleado a aumentar salario");
          nombre = lector.nextLine();
          nombre = lector.nextLine();
          for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNombre().equals(nombre)) {
              empleados.get(i).aumentarSalario();
            }
          }
          break;

      }

    }

  }

}
