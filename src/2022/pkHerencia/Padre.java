package pkHerencia;

public class Padre {
    // Propiedades
    private String nombre;
    private String ocupacion;
    private String sexo;
    private int Edad;

    // Constructores
    public Padre() {
        nombre = "Pepe";
        ocupacion = "Programador";
        sexo = "M";
        Edad = 20;

    }

    // constructor + spbrecarga
    public Padre(String nombre) {
        this.nombre = nombre;
        this.ocupacion = "Programador";
        this.sexo = "M";
        this.Edad = 20;

    }

    public Padre(String nombre, String ocupacion, String sexo, int Edad) {
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.sexo = sexo;
        this.Edad = Edad;

    }
    // Metodos

    public void presentarse() {
        System.out.println(" --------------------- ");
        System.out.println("Yo me llamao: " + nombre);
        System.out.println("Soy un: " + ocupacion);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + Edad);

    }

}
