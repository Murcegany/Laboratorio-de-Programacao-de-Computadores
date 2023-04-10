/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java.atividade1;

/**
 *
 * @author User
 */
public class TrianguloRetangulo {
    private double h;
    private double c1;
    private double c2;
    
    // criando minhas variáveis para o uso do teorema, meus catetos e a hipotenusa
    
    public TrianguloRetangulo(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
    }

    public double getHipotenusa() {
        return h;
    }

    public double getArea() {
        return (c1 * c2) / 2;
    }
}

