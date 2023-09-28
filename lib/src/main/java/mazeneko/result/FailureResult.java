package mazeneko.result;

public record FailureResult<SUCCESS, FAILURE>(FAILURE content) implements Result<SUCCESS, FAILURE> {
}
