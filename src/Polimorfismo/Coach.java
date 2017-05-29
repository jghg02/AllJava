package Polimorfismo;

/**
 * Created by jhgonzalez on 5/29/17.
 */
public class Coach extends FutbolTeam {

    private int federation;

    //Se implementa el metodo definido en la clase padre
    //Por esto tiene el tag @Override para sobreescribir el metodo
    @Override
    public void training() {
        System.out.println("Direct Trainning...  (Coach Class)");
    }
}
