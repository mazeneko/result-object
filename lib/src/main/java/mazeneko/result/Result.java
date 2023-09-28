package mazeneko.result;

public sealed interface Result<SUCCESS, FAILURE> permits SuccessResult, FailureResult {
}
