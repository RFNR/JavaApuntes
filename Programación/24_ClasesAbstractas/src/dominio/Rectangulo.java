package dominio;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override // Las clases hijas de una clase abstract deben definir los metodos abstrac. De no hacerlo, la clase hija tambien tiene que ser abstract. 
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
