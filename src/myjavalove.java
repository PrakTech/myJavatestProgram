import java.util.function.Predicate;

public class myjavalove {

     static void pred(int number, Predicate<Integer> predicate){
         if (predicate.test(number)){
             System.out.println("Given number is : " + number);
         }
     }

    public static void main(String[] args) {
        pred(11, integer -> integer>10);
    }
}
