package dominio;

public abstract class FiguraGeometrica { /* Las clases abstractas se usan para definir metodos que no tiene implementacion. Es decir metodos 
    que todavia no sabemos que haran en el futuro, pero los necesitamos ahi. Se puede definir clases abstract sin que haya metodos abstract 
    pero no es comun. En cambio, no se puede definir metodos abstract en un clase que no sea abstrac.
    Otro detalle es que no podemos crear objetos a partir de clases abastrac. Solo a traves de sus clases hijas.
    */
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    public abstract void dibujar(); /* Metodo que no tiene implementacion -> se marca como abstrac. */

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
