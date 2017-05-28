package Herencia;

/**
 * Created by jhgonzalez on 5/28/17.
 */

//Declaracion de la clase Studen que extiende de la clase Person
public class Student extends Person {

    //Declaración del atributo especifico de la clase Studen.
    private String college;

    /**
     * En este caso estoy creando el constructor de la clase Studen pero al tener la relación de herencia
     * se deben pasar los mismos parametros que se declararon en la clase padre por eso sale un super(...)
     * esta es la palabra usada en java para hacer referencia al constructor de la clase padre
     *
     * @param name     : parametro de tipo String
     * @param lastName : parametro de tipo String
     * @param email    : parametro de tipo String
     */
    public Student(String name, String lastName, String email, String college) {
        //Esta sentencia hace referencia al constructor de la clase padre
        //como puden ver se le pasan todos los parametros que se definieron en Person
        super(name, lastName, email);

        this.college = college;
    }

    /**
     * Metodo que me imprime por consola todos los valores de un Student
     */
    public void printAllData(){
        System.out.println("Los datos del Estudiando son: \n Nombre: " + getName() + " \n Apellido: " + getLastName() + "\n" +
                            "Email: " + getEmail());
    }


}
