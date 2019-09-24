import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String nome;
		float n1,n2,n3,media = 0;
		
		nome = JOptionPane.showInputDialog(null, "digite o nome do aluno");
		n1 = Float.parseFloat(JOptionPane.showInputDialog(null,"digite a primeira nota"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog(null,"digite a segunda nota"));
		n3 = Float.parseFloat(JOptionPane.showInputDialog(null,"digite a terceira nota"));
		
		
		media = ((n1 + n2 + n3)/3);
		
		JOptionPane.showMessageDialog(null,"A média do aluno" + nome + media);
		
		if (media<7)
		{
			JOptionPane.showMessageDialog(null,"O aluno" + nome + "foi reprovado");
		}
	
		else if (media >= 4 && media <7) {
		    JOptionPane.showMessageDialog(null,"O aluno" +nome + "prova final");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"O aluno" + nome + "foi aprovado");
		}
	}

}
