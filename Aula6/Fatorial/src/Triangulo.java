public class Triangulo {
    
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public String typeTriangle(double a, double b, double c) {
        if(a < 0 || b < 0 || c < 0) {
            return "Valores inválidos!";
        }
        if(c > Math.abs(a - b) && c < a + b && a > Math.abs(b - c) && a < b + c && b > Math.abs(a - c) && b < a + c) {
            if(a != b && b != c && a != c) {
                return "Escaleno";
            } else if(a == b && b == c) {
                return "Equilatero";
            } else {
                return "Isosceles";
            }
        }
        return "Esse triângulo não existe!";
    }
}
