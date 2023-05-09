package Controladores;

import Entidades.Carro;
import Servicios.ServicioParqueo;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping
public class ControlParqueo {

    private final ServicioParqueo servicioParqueo;

    public ControlParqueo(ServicioParqueo sp){
        this.servicioParqueo=sp;
    }

    @GetMapping("/carros")
    public ResponseEntity<ArrayList<Carro>> getListaParqueos(){
        return ResponseEntity.ok(this.servicioParqueo.getListaParqueos());
    }

    @PostMapping("/carros")
    public ResponseEntity<Carro> addParqueo(Carro c){
        this.servicioParqueo.agregarParqueo(c);
        return new ResponseEntity<>(c, HttpStatus.CREATED);
    }
}
