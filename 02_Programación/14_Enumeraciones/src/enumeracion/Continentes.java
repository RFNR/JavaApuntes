
package enumeracion;

public enum Continentes {
    
    AFRICA(53, "2 mil millones"),
    EUROPA(46, "60 millones"), 
    ASIA(44, "14 millones"), 
    AMERICA(34, "900 millones"), 
    OCEANIA(1, "70 millones"), 
    ANTARTIDA(0, "0 habitantes");
    
    private final int paises;
    private final String poblacion;
    
    Continentes(int paises, String poblacion){
        this.paises = paises;
        this.poblacion = poblacion;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getPoblacion() {
        return poblacion;
    }
    
}
