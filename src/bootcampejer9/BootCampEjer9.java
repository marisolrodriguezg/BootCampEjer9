package bootcampejer9;

public class BootCampEjer9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNombre("Marisol");
        cliente.setEdad(32);
        cliente.setTelefono(26155555);
        cliente.setCredito("si");
        System.out.println("nombre " + cliente.getNombre() + "edad " + cliente.getEdad() + " edad " + cliente.getEdad() + " credito " + cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Sol");
        trabajador.setEdad(40);
        trabajador.setTelefono(5465246);
        trabajador.setSalario(10000);

        System.out.println("nombre " + trabajador.getNombre() + " edad " + trabajador.edad + " telefono "
                + trabajador.getTelefono() + " salario " + trabajador.getSalario());

    }
}

class Persona {

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

class Cliente extends Persona {

    String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {

    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
