package Backend;

public class ObjetoExtraviado {

        private String descripcion;
        private Usuario usuario;
    
        public ObjetoExtraviado(String descripcion, Usuario usuario) {
            this.descripcion = descripcion;
            this.usuario = usuario;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public Usuario getUsuario() {
            return usuario;
        }
    
        public void setUsuario(Usuario usuario) {
            this.usuario = usuario;
        }
    }
    

