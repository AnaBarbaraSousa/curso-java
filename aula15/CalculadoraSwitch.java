
package aula15;
import java.util.Scanner;

public class CalculadoraSwitch {
    // Calculadora Switch

    public static void main(String[] args){

    Scanner scanner = new Scanner (System.in);

    System.out.print("Primeiro Numero: ");
    double a = scanner.nextDouble();

    System.out.print("Operador (+, -, *, /):");
    char op = scanner.next().charAt(0);

      System.out.print("Segundo Numero: ");
      double b = scanner.nextDouble();


    switch (op) {
        case '+':
            System.out.println("Resultado: "+ (a + b));
            break;

        case '-':
            System.out.println("Resultado: "+ (a - b));
            break;
        case '*':
            System.out.println("Resultado: "+ (a * b));
            break;

        case '/':
            if (b == 0) {
                System.out.println("Erro: divisão por zero.");
            } else {
                System.out.println("Resultado:" + (a / b));
            }
            break;
        default:
            System.out.println("Operador inválido.");
            break;
    }

    scanner.close();
}
    

}



    


