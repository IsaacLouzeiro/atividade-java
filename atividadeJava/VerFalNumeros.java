import java.util.*; 

public class VerFalNumeros {
    public static void main(String[] args) {
        System.out.println("|| Numeros positivos ou negativos ||\n");

    Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o primeiro valor: ");  
		int n1 = sc.nextInt();

        System.out.print("Insira o segundo valor: ");  
		int n2 = sc.nextInt();

        String valor;
        if((n1 < 0) && (n2 < 0)) {
            valor = "Verdadeiro";
        }else if((n1 > 0) && (n2 > 0)){
            valor = "Verdadeiro";
        }else {
            valor = "Falso";
        }
        
        System.out.println("\nOs valores inseridos tem o mesmo resultado?");
        System.out.println("R: " + valor + "\n");


    }
}
