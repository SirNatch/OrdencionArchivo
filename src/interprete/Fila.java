
package interprete;

public class Fila {
    //padrones-beneficiarios-financiamiento-a-bosques
    private String programa;
    private String estado;
    private String municipio;
    private String superficie;
    private String unidad;
    private String monto;
    
    public String columna(int n){
        switch(n){
            case 1:
                return this.programa;
            case 2:
                return this.estado;
            case 3:
                return this.municipio;
            case 4:
                return this.superficie;
            case 5:
                return this.unidad;
            case 6:
                return monto;
            default:
                return null;
        }
    }
}
