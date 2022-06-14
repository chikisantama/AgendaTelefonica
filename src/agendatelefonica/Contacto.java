
package agendatelefonica;

public class Contacto {
    private String nombre;
    private int numeroTelefono;
    
    Contacto(String nombre, int numeroTelefono){
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }
    
    Contacto(String nombre){
        this.nombre = nombre;
        this.numeroTelefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    public boolean validar(Contacto c){
        if(this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }              
        return false;
    }
    
    
    
    
}
