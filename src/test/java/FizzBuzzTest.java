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

    @Test
    void shouldReturnFizzBuzzWhenInputIsSeventyFive(){
        FizzBuzz fizzBuzz = new FizzBuzz(75);
        assertEquals("FizzBuzz",fizzBuzz.findFizzBuzzUpdated());
    }

    @Test
    void shouldReturnFizzWhenInputIsSiz(){
        FizzBuzz fizzBuzz = new FizzBuzz(6);
        assertEquals("Fizz",fizzBuzz.findFizzBuzzUpdated());
    }

    @Test
    void shouldReturnFizzWhenInputIsSeventyThree(){
        FizzBuzz fizzBuzz = new FizzBuzz(73);
        assertEquals("Fizz",fizzBuzz.findFizzBuzzUpdated());
    }

    @Test
    void shouldReturnBuzzWhenInputIsThirtyFive(){
        FizzBuzz fizzBuzz = new FizzBuzz(25);
        assertEquals("Buzz",fizzBuzz.findFizzBuzzUpdated());
    }

    @Test
    void shouldReturnBuzzWhenInputIsFiftyTwo(){
        FizzBuzz fizzBuzz = new FizzBuzz(52);
        assertEquals("Buzz",fizzBuzz.findFizzBuzzUpdated());
    }
}