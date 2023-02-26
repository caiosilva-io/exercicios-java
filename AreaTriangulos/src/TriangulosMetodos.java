public class TriangulosMetodos {
    public static void main(String[] args) throws Exception {
        double t1 = areaTriangulo(9.9, 8, 6);
        double t2 = areaTriangulo2(7.50,4.50,4.02);

        if(t1>t2){
            System.out.println("Triangulo 1 maior que o Triangulo 2.");
        }else if(t1<t2){
            System.out.println("Triangulo 2 maior que triangulo 1");
        }else{
            System.out.println("Os dois Triangulos são iguais.");
        }
        
    }

    public static double areaTriangulo(double a, double b, double c){
        double perimetro = (( (a+b+c)/2) * (((a+b+c)/2) - a) * (((a+b+c)/2) - b) * (((a+b+c)/2) - c) );
        double area = Math.sqrt(perimetro);
        return area;
    }

    public static double areaTriangulo2(double a, double b, double c){
        double perimetro = (( (a+b+c)/2) * (((a+b+c)/2) - a) * (((a+b+c)/2) - b) * (((a+b+c)/2) - c) );
        double area = Math.sqrt(perimetro);
        return area;
    }
}
