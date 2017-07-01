package Commons;

import Herencia.Person;

import java.util.ArrayList;

/**
 * Created by jhgonzalez on 7/1/17.
 */
public class ArrayListCommons {

    private ArrayList<String> lista = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();

    public void addToArrayList(String dato){
        lista.add(dato);
    }

    public void printData(){
        System.out.println(lista);
    }

    public void addPerson(Person p){
        persons.add(p);
    }

    public void printPersons(){
        for (Person p : persons){
            System.out.println(p.getName());
            System.out.println(p.getLastName());
            System.out.println(p.getEmail());
        }

        for (int i = 0 ; i < persons.size() ; i++){
            Person p = persons.get(i);


        }
    }

}
