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

    @Test
    public void shouldReturnFizz_whenMultipleOfThree(){
        FizzBuzz fizzBuz = new FizzBuzz();

        String resultForThree = fizzBuz.say(3);
        String resultForSix = fizzBuz.say(6);

        assertThat(resultForThree).isEqualTo("Fizz");
        assertThat(resultForSix).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnBuzz_whenMultipleOfFive(){
        FizzBuzz fizzBuz = new FizzBuzz();

        String resultForFive = fizzBuz.say(5);
        String resultForTen = fizzBuz.say(10);

        assertThat(resultForFive).isEqualTo("Buzz");
        assertThat(resultForTen).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzBuzz_whenMultipleOfThreeAndFive(){
        FizzBuzz fizzBuz = new FizzBuzz();

        String resultForFifteen = fizzBuz.say(15);

        assertThat(resultForFifteen).isEqualTo("FizzBuzz");
    }
}
