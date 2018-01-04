import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        //Problem double the values and total them

        /*
            Approach 1

            1. Primitive code, bad
            2. Imperative code : has mutations, difficult to make concurrent

         */

        int total =0;

        for(int e:values){

            total+=e*2;
        }
        System.out.println(total);

        /*
            Approach 2

            Declarative approach
            Stream : fancy iterator, has many functions like map
            Map: given an element , performs transformation on the elements,
            nees functions
            Reduce : binary function, requires 2 elements and return result

           Express intention not how to do it

         */

        System.out.println(values.stream().map(a->a*2).reduce(0,(c,e)->c+e));
    }
}
