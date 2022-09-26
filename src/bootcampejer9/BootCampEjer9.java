
package bootcampejer9;

public class BootCampEjer9 {

 
    public static void main(String[] args) {
     Cliente cliente =new Cliente();
     cliente.setNombre("Marisol");
     cliente.setEdad(32);
     cliente.setTelefono(26155555);
     cliente.setCredito("si");
        System.out.println("nombre "+ cliente.getNombre() + "edad " + cliente.getEdad() + " edad "+ cliente.getEdad() + " credito " + cliente.getCredito());
    }}
    
    
    class Persona{
        String nombre;
        int edad;
        long telefono;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public long getTelefono() {
            return telefono;
        }

        public void setTelefono(long telefono) {
            this.telefono = telefono;
        }
        
        
    }
    class Cliente extends Persona{
        
        String credito; 

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

      
    } 
    

