import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void shouldReturnFizzBuzzWhenInputIsFifteen(){
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals("FizzBuzz",fizzBuzz.findFizzBuzz());
    }

    @Test
    void shouldReturnFizzWhenInputIsEighteen(){
        FizzBuzz fizzBuzz = new FizzBuzz(18);
        assertEquals("Fizz",fizzBuzz.findFizzBuzz());
    }

    @Test
    void shouldReturnBuzzWhenInputIsTwentyFive(){
        FizzBuzz fizzBuzz = new FizzBuzz(25);
        assertEquals("Buzz",fizzBuzz.findFizzBuzz());
    }

    @Test
    void shouldReturnEmptyStringWhenInputIsTwentyThree(){
        FizzBuzz fizzBuzz = new FizzBuzz(23);
        assertEquals("",fizzBuzz.findFizzBuzz());
    }
}