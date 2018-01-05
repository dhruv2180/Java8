import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);


        //The double of the first even number in the list
        //Code is broken but the reason ?? dont know
        int result=0;

        for(int e:values){

            if(e>3 && e%2==0){

                result=e*2;

                break;
            }
        }
        System.out.println(result);



        /*
            re implement
            result is optional, even no value found return 0

            Follows the lazy approach, filter and map do not do much
            method like terminal function that trigger computation
        */
        result=values.stream()
                .filter(e->e>3)
                .filter(e->e%2==0)
                .map(e->e*2)
                .findFirst()
                .orElse(0);

        System.out.println(result);
    }

}
