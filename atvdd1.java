package aula2905pct;
import java.util.ArrayList;
public class atvdd1 {

	public static void main(String[] args) {
		
		int soma=0;
		
		ArrayList<Integer> numeros = new ArrayList <Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		System.out.println("Vetor 0: "+numeros.get(0));
		System.out.println("Vetor 1: "+numeros.get(1));
		System.out.println("Vetor 2: "+numeros.get(2));
		System.out.println("Vetor 3: "+numeros.get(3));
		System.out.println("Vetor 4: "+numeros.get(4));
		
		for (int i : numeros) {
			
			soma+=i;
			
		}
		
		System.out.println(" ");
		System.out.println("A soma os 5 vetores é: "+soma);
	}
	

}
