//Esto indica el paquete donde se encuentra nuestra clase main.
//los paquetes los podemos definir dependiendo de nuestras necesidades
package com.jghg02.cl;


//Los import's se realiza para poder utilizar las clases que se creen en el proyecto
import Herencia.Student;
import InputOutput.Inputoutput;
import Polimorfismo.Coach;
import Polimorfismo.FutbolTeam;
import Polimorfismo.SoccerPlayer;

//Esta es la clase principal del programa
public class Main {

    //Funcion que se ejecuta al darle Run al proyecto
    public static void main(String[] args) {

        //Instancia de la clase
        Inputoutput io = new Inputoutput();
        //Invocamos el metodo para que se ejecute
        io.showMessageInConsole();

        //Instancia de la clase Student
        //Es necesario pasarle los parametros ya que en la clase Studen se definio el constructor
        Student student = new Student("Josue","Hernandez","xxxx@gmail.com","UCAB");
        student.printAllData();

        FutbolTeam newCoach = new Coach();
        FutbolTeam newFutbolPlayer = new SoccerPlayer();

        newCoach.training();
        newFutbolPlayer.training();

    }
}
