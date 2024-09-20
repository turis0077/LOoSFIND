package Backend;

public class ObjetoExtraviado { //Clase de registro de objetos extraviado
    //Atributos
    private String tipobjeto;
    private String color;
    private String size;
    private String forma;
    private String fecha;
    private String location;
    private String estado;
    private boolean secretaria; 

    //Constructor
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

    //Get de tipo de objeto
    public String getTipobjeto(){
        return tipobjeto;
    }

    //Get de color
    public String getColor(){
        return color;
    }

    //Get de tamaño
    public String getSize(){
        return size;
    }

    //Get de forma
    public String getForma(){
        return forma;
    }

    //Get de fecha
    public String getFecha(){
        return fecha;
    }
    
    //Get de locación
    public String getLocation(){
        return location;
    }

    //Get de estado
    public String getEstado(){
        return estado;
    }

    //Get de secretaría
    public boolean getSecretaria(){
        return secretaria;
    }

    //set de tipo de objeto
    public void setTipobjeto(String tipobjeto) {
        this.tipobjeto = tipobjeto;
    }

    //Set de color
    public void setColor(String color) {
        this.color = color;
    }

    //Set de tamaño
    public void setSize(String size) {
        this.size = size;
    }

    //Set de forma
    public void setForma(String forma) {
        this.forma = forma;
    }

    //Set de fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //Set de locación
    public void setLocation(String location) {
        this.location = location;
    }

    //Set de estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Set de secretaría
    public void setSecretaria(boolean secretaria) {
        this.secretaria = secretaria;
    }
}
