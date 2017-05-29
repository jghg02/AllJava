package Polimorfismo;

/**
 * Created by jhgonzalez on 5/29/17.
 */
public class SoccerPlayer extends FutbolTeam {

    private int number;

    //Se implementa el metodo definido en la clase padre
    @Override
    public void training() {

        System.out.println("Training (SoccerPlayer Class)");

    }
}
