package api.academy.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CashCardApplicationTests {

    @Test
    void firstTest() {
        assertThat(42).isEqualTo(42);
    }
}
