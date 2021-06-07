import java.util.*; 

public class SomaDosDoisMaiores {
    public static void main(String[] args) {
        System.out.println("|| SOMA DOS DOIS MAIORES NUMEROS ||\n");
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Informe o primeiro número: ");  
		int n1 = sc.nextInt();
        
        System.out.print("Informe o segundo numero: ");  
		int n2 = sc.nextInt();
        
        System.out.print("Informe o terceiro numero: ");  
		int n3 = sc.nextInt();
        
        
        if(n1 > n2) {
            if(n3 > n2) {
                int soma = n1 + n3;
                System.out.println("A soma entre os dois maiores numeros é: " + soma);
            }
            else {
                int soma = n1 + n2;
                System.out.println("A soma entre os dois maiores numeros é: " + soma);
            }
        }
        if(n2 > n1) {
            if(n3 > n1) {
                int soma = n2 + n3;
                System.out.println("A soma entre os dois maiores numeros é: " + soma);
            }
            else {
                int soma = n2 + n3;
                System.out.println("A soma entre os dois maiores numeros é: " + soma);
            }
        }

    }
}
