/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.atividade1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Principal {
    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    System.out.printf("Insira o que deseja calcular:\n1.Equacao de segundo grau\n2. Teorema de Pitagoras");

    switch (opcao) {

        case 1 -> {
            System.out.print("Digite o valor de a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();
            
            System.out.print("Digite o valor de c: ");
            double c = scanner.nextDouble();
            
            Equacao eq = new Equacao(a, b, c);
            
            double delta = eq.getDelta();
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x1 = eq.getX1();
                System.out.printf("A equação possui apenas uma raiz: x = %.2f\n", x1);
            } else {
                double x1 = eq.getX1();
                double x2 = eq.getX2();
                System.out.printf("A equação possui duas raízes: x1 = %.2f e x2 = %.2f\n", x1, x2);
            }   }

        case 2 -> {
            System.out.print("Insira o valor do primeiro cateto: ");
            double c1 = scanner.nextDouble();
            
            System.out.print("Insira o valor do segundo cateto: ");
            double c2 = scanner.nextDouble();
            
            TrianguloRetangulo triangulo = new TrianguloRetangulo(c1, c2);
            //criando meus objeto e passando seus parametros
            
            double hipotenusa = triangulo.getHipotenusa();
            double area = triangulo.getArea();
            //chamando os metodos da classe TrianguloRetangulo e calculando
            
            System.out.println("Hipotenusa: " + hipotenusa);
            System.out.println("Área: " + area);
            }
    
        }
    }
}
