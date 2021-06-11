import java.util.*;

public class SomaDosDezNumeros {
    public static void main(String[] args) {
        System.out.println("|| SOMA DOS DEZ NUMEROS ||\n");
        
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
        
        
        int soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;

        System.out.println("\n" + n1 + " + " + n2 + " + " + n3 + " + " + n4 + " + " + n5 + " + " + n6 + " + " + n7 + " + " + n8 + " + " + n9 + " + " + n10 + " = " + soma + ".");

    }
}
