package test;

import dominio.FiguraGeometrica;
import dominio.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica();
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
   
}
