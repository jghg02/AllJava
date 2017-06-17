package DataBase;

import java.sql.*;

/**
 * Created by jhgonzalez on 6/3/17.
 */
public class Connect {

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;


    public void connectToDB() {
        try {
            //Cargamos el driver para conectarnos a MySQL
            Class.forName("com.mysql.jdbc.Driver");
            /** Configuramos los parametros necesarios para poder conectarnos a la base de datos donde:
             *
             * jdbc:mysql: -> Hace referencia al conector que estamos utilizando en este caso es MySQL
             *                Para cada manejador de BD existe una lib.
             *
             * 127.0.0.1 -> Hace referencia al host donde esta instalado el manejador de BD.
             *
             * world -> Es el nombre de la base de datos a la cual me estoy conectando
             *
             * Tambien se les pasa el User y Password para poder conectarme a la base de datos.
             *
            */
            connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1/world?autoReconnect=true&useSSL=false","admin","1234");


            // Statements permite ejecutar comendos para ser enviamos al manejador de BD
            statement = connect.createStatement();

            // Resultset con esto se obtiene el resultado de ejecutar la consulta.
            resultSet = statement.executeQuery("select * from countrylanguage");

            // Llamo al metodo que me premite imprimir por pantalla los resultados.
            writeResultSet(resultSet);

            // Este Catch lo que permite atajar un posible error que puede ocurrir durante la coneccion a la BD
        } catch (Exception e) {

            //Si durante la coneccion a la base de datos se produce algun error este codigo se ejecutara.
            System.out.println("Error to try connect your database");
            System.out.println("This is the error: " + e.getMessage());
        } finally {
            //Este finally siempre se ejecutara intependientemente  de si ocurre algun error al conectarme.
            // y lo que hace este metodo es cerrar la connección a la base de datos
            close();
        }

    }

    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);

            System.out.println(resultSet.getString("Language"));
            System.out.println(resultSet.getBoolean("IsOfficial"));
        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {
            System.out.println("This is the error: " + e.getMessage());
        }
    }

}
