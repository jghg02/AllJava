package InputOutput;

import java.util.Scanner;

/**
 * Created by jhgonzalez on 5/27/17.
 */
public class Inputoutput {

    /**
     * Metodo publico que me permite mostrar información por la consola
     * y poder leer la data que se ingresa desde la misma.
     *
     * Este metodo no recibe ningun parametro y retorna void
     */
    public void showMessageInConsole() {
        //Para poder leer la información que se obtiene del teclado.
        Scanner scanner = new Scanner(System.in);

        //Imprimo por pantalla este mensaje
        System.out.println("Cual es tu Nombre:");

        //Almaceno en la variable nombre el dato que se introduce por teclado
        String lastName = scanner.nextLine();

        //Imprimo por consola el valor que se introdujo por teclado
        System.out.println("Tu Nombre es: " + lastName);

        System.out.println("Cual es tu edad: ");
        int age = scanner.nextInt();
        System.out.println("Tu edad es: " + age);
    }

}
