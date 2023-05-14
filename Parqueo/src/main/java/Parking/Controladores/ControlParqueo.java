package Parking.Controladores;

import Parking.Entidades.Carro;
import Parking.Servicios.ServicioParqueo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/parqueo")
public class ControlParqueo {

    private final ServicioParqueo servicioParqueo;

    public ControlParqueo(ServicioParqueo sp){
        this.servicioParqueo=sp;
    }

    @GetMapping("/carros")
    public ResponseEntity<ArrayList<Carro>> getListaParqueos(){
        return ResponseEntity.ok(this.servicioParqueo.getListaParqueos ());
    }

    @PostMapping("/carros")
    public ResponseEntity<Carro> addParqueo(@RequestBody Carro c){
        this.servicioParqueo.agregarParqueo(c);
        return new ResponseEntity<>(c, HttpStatus.CREATED);
    }
}
