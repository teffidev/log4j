import main.logging.ListaPromedio;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {

        //File log4jfile = new File("./src/logging/config/log4j.properties");
        //PropertyConfigurator.configure(log4jfile.getAbsolutePath());


        ListaPromedio listaPromedioMayorA5 = null;
        ListaPromedio listaPromedioMayorA10 = null;
        ListaPromedio listaPromedioVacia = null;


        listaPromedioMayorA5 = new ListaPromedio(Arrays.asList(11, 2, 3, 4, 5, 6));
        listaPromedioMayorA10 = new ListaPromedio(Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        listaPromedioVacia = new ListaPromedio(new ArrayList<>());


        System.out.println(listaPromedioMayorA5.promedio());
        System.out.println(listaPromedioMayorA10.promedio());
        System.out.println(listaPromedioVacia.promedio());


    }
}