import java.util.*; 

public class MaiorNumero {
    public static void main(String[] args) {
        System.out.println("|| MAIOR NÚMERO INFORMADO ||\n");
        
        Scanner sc = new Scanner(System.in); 
        System.out.print("Informe o primeiro número: ");  
		int n1 = sc.nextInt();
        
        System.out.print("Informe o segundo numero: ");  
		int n2 = sc.nextInt();
        
        System.out.print("Informe o terceiro numero: ");  
		int n3 = sc.nextInt();
        
        
        if(n1 > n2) {
            if(n1 > n3) {
                int maior = n1;
                System.out.println("O maior valor é: " + maior);
            }
        }
        if(n2 > n1) {
            if(n2 > n3) {
                int maior = n2;
                System.out.println("O maior valor é: " + maior);
            }
        }
        if(n3 > n1) {
            if(n3 > n2) {
                int maior = n3;
                System.out.println("O maior valor é: " + maior);
            }
        }

    }
}
