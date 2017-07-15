package Herencia;

import Interface.Cantante;

/**
 * Created by jhgonzalez on 5/28/17.
 */

/**
 * Clase Persona que implemta la interfaz.
 * Al hacer que implemente la interfaz es necesario declarar la
 * implementacion del metodo que se declaro en la interfaz
 */
public class Person implements Cantante{

    //Declaracion de todos los atributos de la clase Person
    private String name;
    private String lastName;
    private String email;
    private static String nacionalidad;

    /**
     * Constructor de la clase. Metodo que se invoca automaticamente cuando se instancia
     * la clase Person
     *
     * @param name: parametro de tipo String
     * @param lastName: parametro de tipo String
     * @param email: parametro de tipo String
     */
    public Person(String name, String lastName, String email){
        //Asignamos a los atributos de la clase Person (name,lastName,email) los valores que
        //le pasamos por parametros
        //el this hace referencia a las variables declaradas de la propia clase. En este caso hace referencia
        //a los stributos de la clase persona.
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    /**
     * Metodo que me retorna el valor del Nombre
     * @return: rentorno un String
     */
    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public static void setNacionalidad(String nacionalidad){
        Person.nacionalidad = nacionalidad;

    }

    public static String getNacionalidad(){
        return Person.nacionalidad;
    }

    @Override
    public void cantar() {
        System.out.println("Aqui va la implementación de que se quiere hacer con el metodo de la interfaz...");
    }

    public void hacerCantar(Cantante c){
        c.cantar();
    }
}
