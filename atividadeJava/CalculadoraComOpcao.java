import java.util.*; 

public class CalculadoraComOpcao {
    public static void main(String[] args) {
        System.out.println("|| CALCULADORA ||\n");

    Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o primeiro valor: ");  
		int n1 = sc.nextInt();

        System.out.print("Insira o segundo valor: ");  
		int n2 = sc.nextInt();

        System.out.println("|| Insira uma das opcoes abaixo ||\n");
        System.out.println("1) Soma \n2) Subtracao\n3) Multiplicacao\n4) Divisao\n");

        System.out.print("Insira: ");  
		int opc = sc.nextInt();


        int calculo;

        switch (opc) {
            case 1:
                calculo = n1 + n2;


                System.out.println("O resultado de: " + n1 + " + " + n2 + " = " + calculo + ".");
                break;
            
            case 2:
                calculo = n1 - n2;


                System.out.println("O resultado de: " + n1 + " - " + n2 + " = " + calculo + ".");
                break;

            case 3:
                calculo = n1 * n2;


                System.out.println("O resultado de: " + n1 + " * " + n2 + " = " + calculo + ".");
                break;
            
            case 4:
                calculo = n1 / n2;


                System.out.println("O resultado de: " + n1 + " / " + n2 + " = " + calculo + ".");
                break;
        
            default:
                break;
        }
    }
}
