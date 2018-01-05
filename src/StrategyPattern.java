import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StrategyPattern {

    public static int totalValues(List<Integer> number) {

        int total = 0;
        for (int i : number) {
            total += i;
        }
        return total;
    }

    public static int totalEvenValues(List<Integer> number) {

        int total = 0;

        for (int i : number) {
            if (i % 2 == 0) {
                total += i;
            }

        }
        return total;
    }

    public static int totalOddValues(List<Integer> number) {

        int total = 0;

        for (int i : number) {
            if (i % 2 != 0) {
                total += i;
            }

        }
        return total;
    }


    /*
        Approach with predicate

        c -> result of previous call, initial value is 0
        e -> sum
     */

    public static int totalValuesWithPredicate(List<Integer> number, Predicate<Integer> selector) {

        return number.stream()
                .filter(selector)
                .reduce(0, (c, e) -> c + e);
    }

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(totalValues(values));
        System.out.println(totalEvenValues(values));
        System.out.println(totalOddValues(values));

        //Call with custom selectors
        System.out.println(totalValuesWithPredicate(values, e -> true));
        System.out.println(totalValuesWithPredicate(values, e -> e % 2 == 0));
        System.out.println(totalValuesWithPredicate(values, e -> e % 2 != 0));

    }
}
