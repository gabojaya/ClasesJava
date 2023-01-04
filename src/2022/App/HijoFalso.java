package App;

import pkHerencia.Hijo;
import pkHerencia.Padre;

public class HijoFalso {
 public static void main(String[] args) {
        Padre p1 = new Padre();
        Padre p2 = new Padre("Lucho");
        Padre p3 = new Padre("Pepe","Quimico","M",23);
        

        Hijo h1 = new Hijo("AnA");
        h1.presentarse();
        Hijo h3 = new Hijo("Anita","Estudiante","F",25);
        h3.presentarse();

        //p1.presentarse();
        //p2.presentarse();
        //p3.presentarse();





        
    }
}
