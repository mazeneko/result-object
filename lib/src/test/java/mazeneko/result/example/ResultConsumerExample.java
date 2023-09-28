package mazeneko.result.example;

import mazeneko.result.FailureResult;
import mazeneko.result.SuccessResult;

/**
 * Resultを受け取って使う処理のサンプル
 */
class ResultConsumerExample {
  private final ResultProviderExample resultProviderExample;

  ResultConsumerExample(ResultProviderExample resultProviderExample) {
    this.resultProviderExample = resultProviderExample;
  }

  String run(boolean willSucceed) {
    final var result = resultProviderExample.run(willSucceed);
    if (result instanceof final SuccessResult<SuccessMessage, FailureReason> success) {
      return success.content().message();
    } else if (result instanceof final FailureResult<SuccessMessage, FailureReason> failure) {
      return failure.content().reason();
    } else {
      throw new IllegalStateException();
    }
  }
}
