import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Define los coeficientes de la ecuación cuadrática: (ax^2 + bx + c = 0)");
            System.out.print("a: ");        
            double a = sc.nextDouble();

            System.out.print("b: ");
            double b = sc.nextDouble();

            System.out.print("c: ");
            double c = sc.nextDouble();

            Ecuacion ecuacion = new Ecuacion(a, b, c);

            double[] soluciones = ecuacion.resolver();
        }
    }
}