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

    
}
