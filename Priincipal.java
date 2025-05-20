package br.edu.principal;
import br.edu.figurasgeometricasplanas.*;

public class Priincipal {
	public static void main(String[] args) {
        Triangulo fg1 = new Triangulo();
        fg1.recebaBase(10);
        fg1.recebaAltura(6);
        fg1.calcArea();

        fg1.mostrarArea();
        
        double area = fg1.mostrarAreaComRetorno();
        System.out.println("Área retornada: " + area);
   

	        Quadrado fg2 = new Quadrado();
	        fg2.recebaLado(8);
	        fg2.calcArea();
	        fg2.mostrarArea();
	        double areaQuadrado = fg2.mostrarAreaComRetorno();
	        System.out.println("Área do quadrado com retorno: " + areaQuadrado);
	        System.out.println();
	        
	        Circulo fg3 = new Circulo();
	        fg3.recebaRaio(9);
	        fg3.calcArea();
	        fg3.mostrarArea();
	        double areaCirculo = fg3.mostrarAreaComRetorno();
	        System.out.println("Área do círculo com retorno: " + areaCirculo);
	        System.out.println();
	        
	        Hexagono fg9 = new Hexagono();
	        fg9.recebaLado(4);
	        fg9.calcArea();
	        fg9.mostrarArea();
	        double areaHexagono = fg9.mostrarAreaComRetorno();
	        System.out.println("Área do hexágono com retorno: " + areaHexagono);
	        System.out.println();
	        
	        
	        
	}
	

}


