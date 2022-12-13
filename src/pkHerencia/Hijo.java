package pkHerencia;

public class Hijo extends Padre {
   // String nombre;

    // constructor
    public Hijo(String nombreHijo) {
        super(nombreHijo);
    }
    public Hijo(String nombre, String ocupacion,String sexo, int edad){
        super(nombre, ocupacion, sexo, edad);

    }
}
