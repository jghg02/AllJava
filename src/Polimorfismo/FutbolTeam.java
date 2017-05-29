package Polimorfismo;

/**
 * Created by jhgonzalez on 5/29/17.
 */
public abstract class FutbolTeam {
    protected int id;
    protected String name;
    protected String lastName;

    public void trip(){
        System.out.print("Trip (Clase Padre)");
    }

    //Metodo abtracto no se implemente en las clases abstractas pero si en las clases hijas.
    public abstract void training();
}
