package chessgame.exception;

import org.springframework.http.HttpStatus;

public abstract class ChessException extends RuntimeException {

    public abstract HttpStatus status();

    public abstract String message();
}
