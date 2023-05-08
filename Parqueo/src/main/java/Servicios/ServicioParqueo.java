package Servicios;
import Entidades.Carro;

import java.util.ArrayList;

public class ServicioParqueo {


    private ArrayList<Carro> listaParqueos;



    public ServicioParqueo(){
        listaParqueos=null;
    }
    //TODO: HISTORA DE USUARIO 4
    //Como usuario, quiero poder agregar un auto al parqueo, para poder estacionar
    //mi vehículo.
    public void agregarParqueo(Carro carro){
        this.listaParqueos.add(carro);
    }
    //TODO: HISTORA DE USUARIO 1
    //Como usuario, quiero poder ver la lista de todos los autos estacionados en el
    //parqueo, para poder tener una visión general del estado actual del
    //estacionamiento.

    public ArrayList<Carro> getListaParqueos() {
        return listaParqueos;
    }

    public void setListaParqueos(ArrayList<Carro> listaParqueos) {
        this.listaParqueos = listaParqueos;
    }
}
