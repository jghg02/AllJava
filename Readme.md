# Java


Cree este repo para ir colocando la información en relación al código `Java` que estaremos viendo en el curso. 

En el código que les dejo aqui coloque un ejemplo de como leer parametros por teclado y un ejemplo básico de `Herencia`.


### Creación de un proyecto Java con IntelliJ. 

- Lo primero es al abrir el `IDE` es ir a `file` -> `New` -> `Project...`

![uno](https://github.com/jghg02/AllJava/blob/master/img/1.png)

- Luego seleccionar `Java` en el menu derecho. Tener en cuenta que este seleccionado el `SDK`.

![dos](https://github.com/jghg02/AllJava/blob/master/img/2.png)

- Por ultimo se da la opción de poder crear un template para el proyecto `Java`. Este template lo que crea es un bosquejo basico de la app. Para este caso crea la carpeta `src` un paquete por defecto con la clase `Main` que contiene el metodo de donde se inicia la app al momento de ejecutar la app. 

![tres](https://github.com/jghg02/AllJava/blob/master/img/3.png)


## Agregar una lib a un proyecto en Java. 
En este caso vamos a agregar la **lib** para poder conectarnos a una base de datos en **MySQL**

Para esto debemos hacer: 

- Ir a **File** > **Project Structure** 

![cuatro](https://github.com/jghg02/AllJava/blob/master/img/4.png)

- Luego hacer click en el boton **+** que se encuentra en la parte inferior de la pantalla. 

![cinco](https://github.com/jghg02/AllJava/blob/master/img/5.png)

- Seleccionamos **JARs or Directory**

![seis](https://github.com/jghg02/AllJava/blob/master/img/6.png)

- Buscamos el directorio donde tenemos el **mysql connector** y le damos open. 

![siete](https://github.com/jghg02/AllJava/blob/master/img/7.png)

- Al darle open se mostrara la siguiente pantalla. 

![ocho](https://github.com/jghg02/AllJava/blob/master/img/8.png)


Para poder agregar la **lib** en *Windows* les dejo la referencia en este [Link.](https://stackoverflow.com/a/32853178/1949689)

# Importante

La libreria de **MySQL** que se necesitaremos para importar en el proyecto se las envie por correo. 

Y el nombre de la libreria es **mysql-connector-java-5.1.42-bin.jar**

Para poder probar este código es necesario que tengan un **usuario** y **password** para la base de datos a donde se van a conectar y tener creada la **BD** (**B**ase de **D**atos).

En la Clase Main es necesario que instancien la Clase **Connect** y que hagan el llamado al metodo **connectToDB** (Esto lo hemos visto en clase. Como instanciar classes en Java)
