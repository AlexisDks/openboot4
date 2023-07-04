public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();

        Cliente cliente = app.new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Juan");
        cliente.setTelefono("3123123123");
        cliente.setCredito(1500);
        System.out.println("El cliente es: " + cliente.getNombre() + " con la edad de " + cliente.getEdad()
                + " el numero es " + cliente.getTelefono() + " tiene de credito " + cliente.getCredito() + "\n");

        Trabajador trabajador = app.new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Juan");
        trabajador.setTelefono("3123123123");
        trabajador.setSalario(1500);

        System.out.println("El Trabajador es: " + trabajador.getNombre() + " con la edad de " + trabajador.getEdad()
                + " el numero es " + trabajador.getTelefono() + " con el sueldo de " + trabajador.getSalario());
    }

    /**
     * InnerApp
     */
    public class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }

    /**
     * InnerApp
     */
    public class Cliente extends Persona {
        private double credito;

        public double getCredito() {
            return credito;
        }

        public void setCredito(double credito) {
            this.credito = credito;
        }
    }

    /**
     * InnerApp
     */
    public class Trabajador extends Persona {
        private double salario;

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
}
