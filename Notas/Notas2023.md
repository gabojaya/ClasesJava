# Miercoles 18/01/2023

- Agregar librerias

Agregar *jar a tu aplicaciones

-Abrimos directorio y lo arrastramos a la carpeta lib

���java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                FrameMaster f = new FrameMaster("Pet-Lover","Resourse\\img\\logo.png");
            }
        });
        ���

- UML + Asociacion (cardinalidad: 0,1,+,*)

-- Bidireccional con multiplicidad 0..1 o 1

-- Direccional con multiplicidad 0..1 o 1

-- Bidireccional con multiplicadad *

el asterisco va con le que esta encima o abajo y debemos crear una lista

- Control de excepciones

try{

} catch{
throw new Exception(message: "error de conversion de datos");
} finally{

}

# Viernes 20/01/2023 Data

## Arquitectura N -TIER

Hace segmentacion para que cada capa tenga una responsabilidad.

N-TIER es la mas tradicional

Sigen un orden

- UI Componentes
- Business Logic
- Data Access component

![Imagen|100](/resource/img/Data.png)

## SQLITE

Base de datos liviana que no necesita un entorno de ejecucion. No necesita instalacion larga.

### Tipos de datos

![Imagen|100](/resource/img/Datos.png)

NULL = Sin informacion almacenada

INTEGER = es un Entero

REAL = es un Float

text = Almacenar informacion

BLOB = Video/texto binario

Siempre se debe tener una Open Database Connectivity

En este caso ODBC ---> sqlite

Tambien se tiene que hacer referencia a la liberia que se va a implementar

## Martes 24/01/2023

(petShop.db) Base de datos --> tablas/vistas/procedi.almac/funciones/etc ------> SQL Transac  

- Oracle  
- SQL server/ AS400  
- MYSQL / POSGEB  
odbc = comunicacion/ extraer y enviar datos  

1. SQLITE ver 3.0  
2. ODBC SQLITE (.jar)  
3. (XXXXXXXX.jar) + App  

PK =  Primary Key  
FK = Foreign Key  

## Miercoles 25/01/2023 




