package controller;

public class TarefaEd3EX05 {
	
	public TarefaEd3EX05 () {
		super();
	}
		
	public int Ex05 (int num){
		if (num < 3) {
//			 a condição de parada foi definida como n < 3 pois segundo a sequencia de Fibonacci, os 2 primeiros numeros são iguais a 1.
			
			return 1;
	
		}
		else {
			return Ex05 (num-1) + Ex05(num -2);
//			já a chamada foi descrita segundo a formula da sequencia de fibonacci
//			que diz que o n(x) da sequencia é igual a n(n -1) + n (n -2).
		}
	}
}
