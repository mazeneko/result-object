package mazeneko.result;

public record SuccessResult<SUCCESS, FAILURE>(SUCCESS content) implements Result<SUCCESS, FAILURE> {
}
