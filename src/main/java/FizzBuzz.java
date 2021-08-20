public class FizzBuzz {
    private int number;
    public FizzBuzz(int number) {
        this.number = number;
    }

    public String findFizzBuzz() {
        if(this.number%3 == 0 && this.number%5 == 0) return "FizzBuzz";
        if(this.number%3 == 0) return "Fizz";
        if(this.number%5 == 0) return "Buzz";
        return "";
    }
}
