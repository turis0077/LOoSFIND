package Backend;

public class ObjetoExtraviado {
    private String tipobjeto;
    private String color;
    private String size;
    private String forma;
    private String fecha;
    private String location;
    private String estado;
    private boolean secretaria; 

    public ObjetoExtraviado(String tipobjeto, String color, String size, String forma, String fecha, String location, String estado, boolean secretaria){
        this.tipobjeto = tipobjeto;
        this.color = color;
        this.size = size;
        this.forma = forma;
        this.fecha = fecha;
        this.location = location;
        this.estado = estado;
        this.secretaria = secretaria;
    }

    public String getTipobjeto(){
        return tipobjeto;
    }

    public String getColor(){
        return color;
    }

    public String getSize(){
        return size;
    }

    public String getForma(){
        return forma;
    }

    public String getFecha(){
        return fecha;
    }
    
    public String getLocation(){
        return location;
    }

    public String getEstado(){
        return estado;
    }

    public boolean getSecretaria(){
        return secretaria;
    }

    public void setTipobjeto(String tipobjeto) {
        this.tipobjeto = tipobjeto;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void setSize(String size) {
        this.size = size;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setSecretaria(boolean secretaria) {
        this.secretaria = secretaria;
    }
}
