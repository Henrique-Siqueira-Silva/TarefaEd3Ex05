package view;
import javax.swing.JOptionPane;
import controller.TarefaEd3EX05;

public class Main {
		public static void main(String[] args) {
		TarefaEd3EX05 m = new TarefaEd3EX05();
		int num = 0;

		num = Integer.parseInt(JOptionPane.showInputDialog("um numero da sequencia de Fibonacci"));

		num = m.Ex05(num);
		System.out.println(num);
	}
}