package mazeneko.result.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ResultTest {
  @Test
  void success() {
    final var resultProviderExample = new ResultProviderExample();
    final var resultConsumerExample = new ResultConsumerExample(resultProviderExample);

    assertAll(
        () -> assertEquals(resultConsumerExample.run(true), "hello"),
        () -> assertEquals(resultConsumerExample.run(false), "failed because `willSucceed` is false"));
  }
}