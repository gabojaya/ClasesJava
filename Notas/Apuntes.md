# <span style ="color:skyblue"> Jueves 17/11/2022 Comandos Shortcuts VisualStudioCode--------
1. Command Palette 

   **Windows** CTRL+SHIFT+P

2. Quick Open 

   **Windows** CTRL+P

3. Toggle Sidebar

   **Windows** CTRL+B

4. Multi-Select Cursor

   **Windows** CTRL+D

5. Copy Line

   **Windows** SHIFT+ALT+UP   or  SHIFT+ALT+DOWN

6. Comment Code Block

   **Windows** SHIFT+ALT+A

7. Go back/move forward

   **Windows** ALT+ -->    OR + <--

8. Show All Symbols

   **Windows** CTRL+T

9. Trigger suggestion and Trigger parameter hint

   **Windows** CTRL+SPACE, CTRL+SHIFT+SPACE

# <span style ="color:skyblue"> Viernes 18/11/2022 Comandos Github--------
- Tu identidad 

$ git config --global user.name "____"

$ git config --global user.email gabo@example.com

- Verficando

$ git config user.name

$ git config user.email

- Inicio del control de versiones

$ git init

$ git status

$ git add .

$ git add NombreCarpeta/NombreArchivo

$ git commit -m 'mensaje : initial project version'

- Inicio del control de versiones -clonando

$ git clone https://github.com/xxyyy/abc

$ git clone https://github.com/xxyyy/abc miPropioNombre

- Quitar archivo del control 

$ echo nombreArchivo.ext >> .gitignore

$ echo *.txt >> .gitignore

- Ver archivos ignorados

$ cat .gitignore

- Forzar agregar archivo excluido

$ git add -f NombreArchivo.log





# <span style ="color:skyblue"> Lunes 21/11/2022 Comandos Markdown--------

**Encabezados**  

Los *encabezados* dependeran del numero de '#' que se coloque delante de cada palabra, siguiendo la misma logica, solo usaremos el # una vez para ser el titulo general del documento

`# Encambezado 1`  
`## Encambezado 2`  
`### Encambezado 3`  
`#### Encambezado 4`  
`##### Encambezado 5`  
`###### Encambezado 6`

**Negrilla1**

__Negrilla2__

*Cursiva*

***Negrilla y cursiva***


== Resaltar ==.


~~tachado~~


## Divisiones 

---

## Codigo

```public class Codigo { 
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }  
} 
```

## Links
[youtube](https://www.youtube.com/watch?v=kFaie-Tp1Jw&list=RDQbAOizRHKxs&index=2)

## Imagen
![Imagen](https://st.depositphotos.com/1625039/1746/i/600/depositphotos_17461085-stock-photo-funny-dachshund.jpg)

![Imagen|100](https://st.depositphotos.com/1625039/1746/i/600/depositphotos_17461085-stock-photo-funny-dachshund.jpg)

>Citas de textos

[ ] Lista

1. Agua

2. Cola

    1.Cola2

    2.Cola3

3.Tea

1. Tea1
2. Tea2

- Lista sin enumerar
- Pan
- Queso

| Nombre  | Edad |
|---------|------|
| Gabriel |  18  |
| Gabriel |  18  |
| Gabriel |  18  |


---
Hola

---

---

# <span style ="color:skyblue"> Martes 22/11/2022 Sintaxis---------------

## <span style ="color: Purple">Compilador
Sintaxis - Codigo bien escrito, palabras reservadas

Semantico - Sentido de lo que se escribe

## <span style ="color:Purple">Metodos 
- retornan valor "funcion"
- no retorna valor "procedimiento"

---

## <span style ="color:Purple">Forma archivo
- Archivo: Hola.java
- public class "Nombre del archivo".
- estandar codif: camelcase 

nombreCompletoApellido   nombre_Completo

```
public class Hola {
    public static void main(String[] args) {
        String nombre; <-----Declaracion
        nombre = "gabo";  <----- inicializacion
        System.out.println("Hello " + "nombre");
    }
}
```
- () --> parametros
- "  " --> variables (Tipo de dato);
  Propiedades < Ambito > < tipo de chats.> < nombreVariable >
- main --> Donde empieza la ejecucion
- void --> No retorna valores
- static --> Este bloque de codigo esta fijo
- public --> Todas las personas pueden ver lo que se hace

### Deber: Revisar tipos de datos orginarios y por creacion de objetos. EJ. String, Integer, int,.. etc.

## Nombrar variable
Siempre al inicio
1. Std. camelcase
2. nombre asociado
3. declaracion (decirle al programa que eres) , inicializacion

## Parametro
<span style ="color:red">Son obligatorios y aveces no, deben tener "tipo de dato" + "nombre"

public static void main (**String argumento**)



## Tipos de lenguajes
- compilado
- interpretado
- intermedios


# <span style ="color:skyblue">Miercoles 23/11/2022 Algoritmo-------------

<span style ="color:lightgreen">**Algoritmia -->Algoritmo----> Solucionar un Problema**
1. Pseudocodigo
2. Diagramas de flujo
3. Codigo (Java)
4. Trace ---> (Debug)

```
public class MayorNumero {
   public static void main(String[] args) {
        int a = 20, b = 10;
        if(a>b){
            System.out.println("El mayor es "+a);
        }else{
            System.out.println("El mayor es "+b);}
    }
}
```

### <span style ="color:orange">**Error**
- compitador
-- sintaxis y semantico
- logico
--division por 0

### <span style ="color:orange">**Issue**
Tiene un defecto

### <span style ="color:orange">**Bug**
Ausencia de seguridad-Vulneravilidad

 Conlusion: Programar de manera **PRO** se logra con tecnica

# <span style ="color:skyblue">Jueves 24/11/2022 Operador Ternario-------------

## Operador ternario
```
m = (a>b)? a:b;
        System.out.println("El valor de m es "+ m);
 ```
 - Sirve para simplificar los 
 ```
 if(a>b){
    m=a;
 }else{
    m=b;
 }
 ```

# <span style ="color:skyblue"> Martes 06/12/2022 Atajo para metodos-------------

  Sacar un metodo del codigo principal
  - Seleccionar las lineas de codigo requeridas
  - Click derecho 
  - Refactor
  - extracted metod
  - poner nombre con verbos infinitivos (calcular,determinar,transportar)
  
# <span style ="color:skyblue"> Martes 13/12/2022 Herencias-----------

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

# <span style ="color:skyblue"> Miercoles 14/12/2022 Constructores---------

### <span style ="color:Purple">**NOTACION PARA AMBITOS**
 "+"  publico
 
" - " privado

" ~ " paquete
" # " protegido

## <span style ="color:orange"> Herencia

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

## <span style ="color:orange"> Constructores
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

``` 
@Override

public String to String(){
}
```

En muchas ocasiones (no siempre) la operacion redefinida invoca la de superclase
- se usa para ello la palabra reservada super

super.nombreMetodo(parametros...);

. se refiere a la superclase del objeto actual

Ejemplo:

```
public class Vigilante Nocturno extends Vigilante{
...
@Override
public float sueld(){
return super.sueldo()+PLUS_NOCTURNIDAD;
}
}
```
atributos protected en Java NO es una buena practica de programacion.

# <span style ="color:skyblue"> Martes 20/12/2022 Modelado UML--------------

Para proyectos grandes
-Giro de negocio


-Casos de uso (Requerimientos funcionales)

Identifica los componentes principales que forma al sistema

Los casos de uso se representa mediante elipses con el nombre del caso

**CASOS DE USO: toma de requerimientos**

Son, ante todo requisitos funcionales

Se generaliza    ------>

Se especifica <--------

**Presenta una ventaja sobre la descripcion textual de los requisitos funcionales.**

-Usuario, sistema, usarios, sistema y creditos.

-Cada elipse debe representar una accion (gerundio)

Primero se lo debe modelar

una felcha indica direccion

una linea puede significar doble direccion
  
---
<< include >>

Relacion de inclusion entre casos de usoespefica que un caso de uso base incorpora explicitamente el comportamiento

<< extend >>

Una relacion de extension

<span style ="color:red"> **Especificaciones**

<span style ="color:orange">  Pre condiciones

Establece lo que siempre se debe cumplirse antes de comenzar un caso

<span style ="color:orange"> Post condiciones

Establece que debe cumplirse cuando el caso de uso se completa con exito


Se lee de arriba hacia abajo.

- Debe responder

- Puede ser?

- Deber ser es?

# <span style ="color:skyblue"> Martes 03/01/2023 Interfaces -----------


## <span style ="color: pink">Interfaz<span style ="color:red"> - fachada
La interfaz nos permite especificar un conjunto de operaciones en clase que pueden ser utilizadas por otras.
La interface difiere de un clase en que no tendra atributos debido a que solo sera un conjunto de operaciones.

- <span style ="color:Orange"> Clase

En clase, puede crear instancias de variables y crear un objeto.

La clase puede contener metodos concretos (con implementaciones)

Los especificadores de acceso utilizados con las clases son privados, protegidos y publicos.

- <span style ="color:Orange">Interfaz

En una interfaz, no puede crear instancias de variable y crear un objeto 

La interfaz no puede contener metodos concretos ( con implementacion)

En la interfaz solo se utiliza un especificador
| PROPIEDAD | CLASES | INTERFAZ |
|-----------|--------|----------|
|Propiedades| SI     | NO       |
|Metodos    | Metodos concretos heredados del padre | No tiene métodos concretos|
|Caracteristicas| Todos los hijos tienen  los mismos metodos | Cada hijo hereda los metodos y PUEDE CONTROLAR el comportamiento de cada método.|
|UML| SE ESTIENDE | SE IMPLEMENTA|

___
___
## User interface UI
Es el espacio donde se producen las interacciones entre sere humanos y maquinas. El objetivo de esta interaccion es permitir el funcionamiento y control mas efectivo de la maquina desde la interaccion con el humano.

___
___

# <span style ="color:skyblue"> Miercoles 04/01/2023 Arquitectura (N-TIER)---------

## **Arquitectura (N-TIER) **

En el Layer - poner un Logic y Ruler

<span style ="color:Orange">Naranja - UI components, solo capta objetos

<span style ="color:skyblue">Azul - Capas de interfases de servicios

<span style ="color:green">Verde - Capas que almacenan informacion

<span style ="color:grey">Gris en vertical - Capas de Seguridad 

Falta unca capa que transporta los datos

Data transfer opcion D.T.O

Data access components D.A.C

**Viene acompañado de un servidor(Hardware)**
Mas RAM

En la capa de energia que homonizacion los saletite

Capas: 

* PRESENTACION - GUI
* APLICACIÓN - código
* DATOS - persistencia de datos

DTO: Extrae como un txt, o excel donde está la info

DAC: Extrae un paquete como Oracle que queda como objetos
