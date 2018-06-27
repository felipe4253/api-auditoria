package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {
    
    @PostMapping(value= "/publico/v1/evento", consumes="application/json", produces="application/json")
    public ResponseEntity registrarEvento(@RequestBody Evento comentario) {
    	
    	return ResponseEntity.ok("{\"result\" : \"Evento registrado com sucesso\"}");
    }
}
