import java.util.Scanner;
public class Main{
public static void main (String[]args){
Scanner LerObj = new Scanner (System.in);
int c;
int n=0;

  for (c=0; c<=255; c++){
    System.out.println(+c+ "," +c);
    n++;
  if (n == 23){
    System.out.println("Pressione uma tecla... ");
    n=0;
  }
  }
}
}
