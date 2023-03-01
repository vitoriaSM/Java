import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    String valor= " ";
    int op=20;
      
  valor= JOptionPane.showInputDialog("Entre com o case 10, 20 ou 30");

  op = Integer.parseInt(valor);

  switch (op){
    case 10: JOptionPane.showMessageDialog (null, "10");
    break;
    case 20: JOptionPane.showMessageDialog(null, "20");
    break;
    case 30: JOptionPane.showMessageDialog (null, "30");
    break;
     default: JOptionPane.showMessageDialog (null, "Not in 10, 20 or 30");  
  }
  }
}