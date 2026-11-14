package fr.cda.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnNumberAsText_whenNotMultipleOfThreeOrFive(){

        String resultForOne = fizzBuzz.say(1);
        String resultForTwo = fizzBuzz.say(2);

        assertThat(resultForOne).isEqualTo("1");
        assertThat(resultForTwo).isEqualTo("2");
    }

    @Test
    void shouldReturnFizz_whenMultipleOfThree(){

        String resultForThree = fizzBuzz.say(3);
        String resultForSix = fizzBuzz.say(6);
        String resultForNine = fizzBuzz.say(9);

        assertThat(resultForThree).isEqualTo("Fizz");
        assertThat(resultForSix).isEqualTo("Fizz");
        assertThat(resultForNine).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnBuzz_whenMultipleOfFive(){

        String resultForFive = fizzBuzz.say(5);
        String resultForTen = fizzBuzz.say(10);
        String resultForTwenty = fizzBuzz.say(20);

        assertThat(resultForFive).isEqualTo("Buzz");
        assertThat(resultForTen).isEqualTo("Buzz");
        assertThat(resultForTwenty).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnFizzBuzz_whenMultipleOfThreeAndFive(){

        String resultForFifteen = fizzBuzz.say(15);
        String resultForThirty = fizzBuzz.say(30);
        String resultForFortyFive = fizzBuzz.say(45);

        assertThat(resultForFifteen).isEqualTo("fr.cda.fizzbuzz.FizzBuzz");
        assertThat(resultForThirty).isEqualTo("fr.cda.fizzbuzz.FizzBuzz");
        assertThat(resultForFortyFive).isEqualTo("fr.cda.fizzbuzz.FizzBuzz");
    }
}
