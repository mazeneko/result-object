package mazeneko.result.example;

import mazeneko.result.FailureResult;
import mazeneko.result.Result;
import mazeneko.result.SuccessResult;

/**
 * Resultを返す処理のサンプル
 */
class ResultProviderExample {
  Result<SuccessMessage, FailureReason> run(boolean willSucceed) {
    if (willSucceed) {
      return new SuccessResult<>(new SuccessMessage("hello"));
    } else {
      return new FailureResult<>(new FailureReason("failed because `willSucceed` is false"));
    }
  }
}
