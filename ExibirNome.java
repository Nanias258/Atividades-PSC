import java.util.Scanner;
import javax.swing.JOptionPane;
 
public class ExibirNome {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    String nome;
    nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    JOptionPane.showMessageDialog(null, nome);
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println("o seu nome é " + nome);
    }
   
    
}
