package PktTablaDeVerdad;

import java.util.Scanner;

public class ClsPrincipal {
    public static void main (String [] args){
        Scanner ObjLeer = new Scanner(System.in);
        ClsFuncionesLogicas ObjLlamar = new ClsFuncionesLogicas();
        int menu = 0;

        while(menu != 3){
            System.out.println("Menu");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Conjuncion");
            System.out.println("2. Disyuncion");
            System.out.println("3. Salir");
            menu = ObjLeer.nextInt();

            switch (menu){
                case 1: System.out.print("CONJUNCION");
                    ObjLlamar.conjuncion();
                    System.out.println();
                    break;

                case 2: System.out.print("DISYUNCION");
                    ObjLlamar.disyuncion();
                    System.out.println();
                    break;

                default: System.out.println("Finalizo la ejecucion");
                    break;
            }
        }
    }
}
