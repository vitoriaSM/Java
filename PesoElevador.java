import java.util.Scanner;

public class PesoElevador{

        public static void main (String[] args){

                Scanner objLeitura = new Scanner(System.in);

                float x, y;

                System.out.println("Capacidade do elevador em kg: ");

                x = objLeitura.nextfloat();

                System.out.println("Quantidade de areia em kg: ");

                y = objLeitura.nextfloat();

                System.out.println("O elevador terá que executar " + x/y + " viagens.");

        }

}