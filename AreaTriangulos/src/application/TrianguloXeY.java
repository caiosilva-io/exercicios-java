
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.TrianguloClass;

public class TrianguloXeY {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        TrianguloClass x,y; // Triangulo --> definição do tipo
        x = new TrianguloClass(); // x é um objeto
        y = new TrianguloClass();

        System.out.println("Digite as medidas do Triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
    
        System.out.println("Digite as medidas do Triangulo X:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Área Triângulo X = %.4f%n", areaX);
        System.out.printf("Área Triângulo Y = %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Area X > Area Y");
        }else if(areaY > areaX){
            System.out.println("Area Y > Area X");
        }else{
            System.out.println("As áreas são iguais");
        }

        sc.close();
    }

}
