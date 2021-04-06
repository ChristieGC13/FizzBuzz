public class FizzBuzz {
    public String FizzBuzz(int number) {
        // fizzbuzz logic here
        if ((number % 3 == 0) && (number % 5 ==0))
            System.out.println("FizzBuzz");
        if (number % 5 == 0) 
            System.out.println("Buzz");
         if (number % 3 == 0) 
            System.out.println("Fizz");
        else {
            System.out.println(number);
        }
    }
}