package gm.inventarios.controlador.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoEncontrado extends RuntimeException{
    public NoEncontrado(String mensaje){
        super (mensaje);
    }
}
