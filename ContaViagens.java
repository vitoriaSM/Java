mport java.util.Scanner;

public class ContaViagens{

        public Static void main (String[] args){

                Scanner LerObjeto = new Scanner(System.in);

                float x, y;

                System.out.println("Qual a capacidade do elevador em kg: ");

                x=LerObjeto.nextfloat();

                System.out.println("Qual a quantidade de areia em kg: ");

                y = LerObjeto.nextfloat();

                System.out.println("O elevador terá que fazer " + x/y + " viagens.");

        }

}