package kr.co.polycube.backendtest._core.errors.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorResponse {
    private String reason;

    public ErrorResponse(String reason) {
        this.reason = reason;
    }
}
