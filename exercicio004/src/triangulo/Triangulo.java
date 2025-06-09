package triangulo;

public class Triangulo {
    double a, b, c;

    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double semiPerimetro(){
        return (a + b + c) / 2;
    }

    public double Area(){
        double p = semiPerimetro();
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args){
        Triangulo novoTriangulo = new Triangulo(3, 4, 5);
        System.out.printf("A área do triângulo é %f", novoTriangulo.Area());
    }
}
