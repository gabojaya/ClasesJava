# Martes 13 Diciembre

- Herencias

Una persona nos puede heredar rutinas (codigo)

Definir:

 Propiedades ----> nombre, cargo, sexo

Acciones ------->  presentarse(nombre, sexo), trabajar(ocupacion),

Metodos ------> Constructores

                 . new
                 . unica ejecucion
                 . valores en las clases
                 . lleva el mismo nombre de la clase

comando "extends"

# Miercoles 14 Diciembre

 

 "+"  publico
 
" - " privado

" ~ " paquete
" # " protegido

## Herencia

herencia---> subclases------>

- todos los coches son vehiculos

La herencia es un mecanismo por el que se puede crear nuevas clases a partir de otras existentes. 

La herecia tambien se denomina Extensión o generalización

Al extender una clase:
- se heredan todas las operaciones del padre
- se puede anadir nuevas operaciones

La subclase se puede elegir para operaciones heredadas:

- redefinir la operacion: se vuelve a escribir
- no hacer nada y heredarla tal como esta en el padre.

La herencia puede aplicarse en sucesivos niveles, creando grandes jerarquias de clases.

## Ventajas y desventajas del uso de la herencia

## Constructores
b = new Barco();

Los constructores no se heredan

las subclases deben definir su propio constructor
Normalmente sera necesario inicializar los tributos de la superclase
- Para ello se llama a su constructor desde el de la subclase.

/** Constructor de una subclase*/
public Subclase(parametros...){

  super(parametros para la superclase);  ------>Siempre debe ir en la primera linea
  //inicializa sus atributos
  ...
  
}

- la llamada a "super" debe ser la primera instruccion del constructor de la subclase



"override"
esta subclase puede redefinir una operacion en lugar de heredarla directamente.
Es conveniente indicarlo utilizando la anotacion

@Override

public String to String(){
}

En muchas ocasiones (no siempre) la operacion redefinida invoca la de superclase
- se usa para ello la palabra reservada super

super.nombreMetodo(parametros...);

. se refiere a la superclase del objeto actual

Ejemplo:

public class Vigilante Nocturno extends Vigilante{
...
@Override
public float sueld(){
return super.sueldo()+PLUS_NOCTURNIDAD;
}
}
atributos protected en Java NO es una buena practica de programacion.
