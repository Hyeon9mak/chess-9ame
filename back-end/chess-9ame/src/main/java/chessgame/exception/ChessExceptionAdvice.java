package chessgame.exception;

import chessgame.web.response.ExceptionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ChessExceptionAdvice {

    @ExceptionHandler(ChessException.class)
    public ResponseEntity<ExceptionResponse> exceptionResponse(ChessException e) {
        return ResponseEntity.status(e.status())
            .body(new ExceptionResponse(e.message()));
    }
}
