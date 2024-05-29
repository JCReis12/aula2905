package aula2905pct;

import java.util.Scanner;
import java.util.ArrayList;

public class atv1 {

	public static void main(String[] args) {
			
		Scanner jc = new Scanner (System.in);
		
		int a[]=new int [5];
		int sm = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Informe um número: ");
		a[i] = jc.nextInt();
		sm += a[i];
		}

		System.out.println("A soma dos 5 números digitados é: "+sm);
	}

}
