/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package java.atividade1;

/**
 *
 * @author User
 */
public class Equacao {
    //criando minha classe para equação que será chamada na classe principal que irá unir as duas atividades

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double delta;
    //criando minhas variáveis baseado na equação de segundo grau
    
    public Equacao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        calculaDelta();
        calculaX1();
        calculaX2();
        
    }
    
    private void calculaDelta() {
        delta = Math.pow(b, 2) - 4 * a * c;
    }
    // criando meu metodo que calcula o delta através da fórmula
    
    private void calculaX1() {
        if (delta >= 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    private void calculaX2() {
        if (delta >= 0) {
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
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

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getDelta() {
        return delta;
    }
    
    //get e setters gerados
}
