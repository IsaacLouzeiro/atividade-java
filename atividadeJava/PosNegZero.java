import java.util.*; 

public class PosNegZero {
    public static void main(String[] args) {
        System.out.println("|| POSITIVO, NEGATIVO ou ZERO ||\n");

    Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe o numero: ");  
		int n1 = sc.nextInt();

        if(n1>0) {
            System.out.println("O valor informado é Positivo");
        }
        else if(n1<0) {
            System.out.println("O valor informado é Negativo");
        }
        else {
            System.out.println("O valor informado é 0");
        }
    }
}
