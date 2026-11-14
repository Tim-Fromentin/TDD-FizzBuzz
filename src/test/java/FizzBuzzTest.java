import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    public void shouldReturnNumberAsText_whenNotMultipleOfThreeOrFive(){
        FizzBuzz fizzBuz = new FizzBuzz();

        String resultForOne = fizzBuz.say(1);
        String resultForTwo = fizzBuz.say(2);

        assertThat(resultForOne).isEqualTo("1");
        assertThat(resultForTwo).isEqualTo("2");
    }
}
