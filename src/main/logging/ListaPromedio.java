package main.logging;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaPromedio {

    //Este objeto estara realizando Logger para esta clase en donde lo estamos usando.
    private static final Logger LOGGER = Logger.getLogger(ListaPromedio.class);

    private List<Integer> listaEnteros = new ArrayList<>();

    public ListaPromedio(List<Integer> listaEnteros) throws Exception {

        this.listaEnteros = listaEnteros;

        if (listaEnteros.size() > 5) {
            LOGGER.info("La lista debe ser mayor a 5 numeros");

        }
        if (listaEnteros.size() > 10) {
            LOGGER.info("La lista debe ser mayor a 10 numeros");

        }
        if (listaEnteros.size() == 0){
            LOGGER.error("ERROR");
            throw new Exception();
        }

    }

    public int promedio() {
        int sum = 0;
        for (Integer num: listaEnteros) {
            sum += num;
        }
        int promedio = sum / listaEnteros.size();
        LOGGER.info("El promedio es: " + promedio);
        return promedio;
    }


    public List<Integer> getListaEnteros() {
        return listaEnteros;
    }

    public void setListaEnteros(List<Integer> listaEnteros) {
        this.listaEnteros = listaEnteros;
    }
}
