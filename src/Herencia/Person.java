package Herencia;

/**
 * Created by jhgonzalez on 5/28/17.
 */
public class Person {

    //Declaracion de todos los atributos de la clase Person
    private String name;
    private String lastName;
    private String email;

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
}
