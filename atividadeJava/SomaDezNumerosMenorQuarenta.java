import java.util.*;

public class SomaDezNumerosMenorQuarenta {
    public static void main(String[] args) {
        System.out.println("|| SOMA ENTRE 10 NÚMEROS < 40 ||\n");
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Informe o primeiro número: ");  
		int n1 = sc.nextInt();
        
        System.out.print("Informe o segundo numero: ");  
		int n2 = sc.nextInt();
        
        System.out.print("Informe o terceiro numero: ");  
		int n3 = sc.nextInt();

        System.out.print("Informe o quarto número: ");  
		int n4 = sc.nextInt();
        
        System.out.print("Informe o quinto numero: ");  
		int n5 = sc.nextInt();
        
        System.out.print("Informe o sexto numero: ");  
		int n6 = sc.nextInt();

        System.out.print("Informe o setimo número: ");  
		int n7 = sc.nextInt();
        
        System.out.print("Informe o oitavo numero: ");  
		int n8 = sc.nextInt();
        
        System.out.print("Informe o nono numero: ");  
		int n9 = sc.nextInt();

        System.out.print("Informe o decimo numero: ");  
		int n10 = sc.nextInt();
        

        int soma;
        if(n1 < 40) {
			soma = n1;
		}
		else {
			soma = 0;
		}
		if(n2 < 40) {
			soma = n2 + soma;
		}
		else {
			soma = soma;
		}
		if(n3 < 40) {
			soma = soma + n3;
		}
		else {
			soma = soma;
		}
		if(n4 < 40) {
			soma = soma + n4;
		}
		else {
			soma = soma;
		}
		if(n5 < 40) {
			soma = soma + n5;
		}
		else {
			soma = soma;
		}

		if(n6 < 40) {
			soma = soma + n6;
		}
		else {
			soma = soma;
		}
		if(n7 < 40) {
			soma = soma + n7;
		}
		else {
			soma = soma;
		}
		if(n8 < 40) {
			soma = soma + n8;
		}
		else {
			soma = soma;
		}
		if(n9 < 40) {
			soma = soma + n9;
		}
		else {
			soma = soma;
		}
		if(n10 < 40) {
			soma = soma + n10;
		}
		else {
			soma = soma;
		}

        System.out.println("\nA soma entre os números informados < 40 é igual a " + soma + ".");
    }
}
