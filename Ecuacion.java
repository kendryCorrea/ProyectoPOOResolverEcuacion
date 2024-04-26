public class Ecuacion {                                                                                                                                   
    private double a;
    private double b;
    private double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
}
public double[] resolver() {
    double discriminante = Math.pow(b, 2) - 4 * a * c;
    double x1, x2;
    if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
    } else if (discriminante == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
     } else {
            return new double[0];
     }

        return new double[]{x1, x2};

    }
}
