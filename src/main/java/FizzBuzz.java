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

    public String findFizzBuzzUpdated() {
        if(this.number%3 == 0 && this.number%5 == 0)return "FizzBuzz";
        if(this.number%3 == 0 || contains(3)) return "Fizz";
        if(this.number%5 == 0 || contains(5)) return "Buzz";
        return "";
    }

    private boolean contains(int i) {
        int num = this.number;
        while(num!=0){
            int digit = num%10;
            if(digit == i)  return true;
            num = num/10;
        }
        return false;
    }
}
