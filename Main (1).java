import javax.swing.JOptionPane;

class Main 
{
  public static void main(String[]args){
    try{
  float numero1 = 0.0F;
  float numero2 = 0.0F;
  float soma = 0.0F;
  float subtracao = 0.0F;
  float multiplicacao = 0.0F;
  float divisao = 0.0F;
  String primeiro = " ";
  String segundo = " ";

primeiro = JOptionPane.showInputDialog("Entre com o primeiro valor");
segundo = JOptionPane.showInputDialog("Entre com o segundo valor");

numero1= Float.parseFloat(primeiro);
numero2= Float.parseFloat(segundo);

JOptionPane.showMessageDialog(null, "Soma=" + (numero1+numero2));
JOptionPane.showMessageDialog(null, "Subtracao=" + (numero1-numero2));
JOptionPane.showMessageDialog(null, "Multiplicacao=" + (numero1*numero2));
JOptionPane.showMessageDialog(null, "Divisao=" + (numero1/numero2));
      }
      
  catch(ArithmeticException e){
    JOptionPane.showMessageDialog(null, "Erro de divisao por zero!");
  }
  catch(Exception e){
    JOptionPane.showMessageDialog(null, "Tente novamente!");
  }
}
}
