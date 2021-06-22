package PktTablaDeVerdad;
import java.math.*;

public class ClsFuncionesLogicas {
    private boolean P[] = {true,false};
    private boolean Q[] = {true,false};

    public void conjuncion(){
        System.out.println("\nP\t\t\tQ\t\t\tP ^ Q");
        System.out.print("------------------------------");
        for (int i = 0; i<2;i++){
            for (int x = 0; x<2;x++){
                System.out.print("\n|"+P[i]+"|\t\t|"+Q[x]+"|\t\t|"+(P[i]&&Q[x])+"|");
            }
        }
        System.out.println();
        System.out.print("------------------------------");
    }

    public void disyuncion(){
        System.out.println("\nP\t\t\tQ\t\t\tP v Q");
        System.out.print("------------------------------");
        for (int i = 0; i<2;i++){
            for (int x = 0; x<2;x++){
                System.out.print("\n|"+P[i]+"|\t\t|"+Q[x]+"|\t\t|"+(P[i]||Q[x])+"|");
            }
        }
        System.out.println();
        System.out.print("------------------------------");
    }
}
