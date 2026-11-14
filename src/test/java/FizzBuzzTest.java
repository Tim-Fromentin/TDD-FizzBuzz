import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    private final FizzBuzz fizzBuz = new FizzBuzz();

    @Test
    public void shouldReturnNumberAsText_whenNotMultipleOfThreeOrFive(){

        String resultForOne = fizzBuz.say(1);
        String resultForTwo = fizzBuz.say(2);

        assertThat(resultForOne).isEqualTo("1");
        assertThat(resultForTwo).isEqualTo("2");
    }

    @Test
    public void shouldReturnFizz_whenMultipleOfThree(){

        String resultForThree = fizzBuz.say(3);
        String resultForSix = fizzBuz.say(6);

        assertThat(resultForThree).isEqualTo("Fizz");
        assertThat(resultForSix).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnBuzz_whenMultipleOfFive(){

        String resultForFive = fizzBuz.say(5);
        String resultForTen = fizzBuz.say(10);

        assertThat(resultForFive).isEqualTo("Buzz");
        assertThat(resultForTen).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzBuzz_whenMultipleOfThreeAndFive(){

        String resultForFifteen = fizzBuz.say(15);
        String resultForThirty = fizzBuz.say(30);

        assertThat(resultForFifteen).isEqualTo("FizzBuzz");
        assertThat(resultForThirty).isEqualTo("FizzBuzz");
    }
}
