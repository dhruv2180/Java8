import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        /*
            Approach No. 1

            1. Complex as manage variable
            2. boundry conditions
            3. uses external iterator
         */

        for (int i = 0; i < values.size(); i++) {

            System.out.print(values.get(i));
        }

        /*
            Approach No. 2

            1. Simpler since lesser moving parts
            2. but still complex since uses external iterators

         */

        for (int i:values){

            System.out.print(i);
        }


        /*
            Approach No. 3

            (Internal iterator approach, uses anonymous class )

            1. management of iterator done automatically by the collection
            2. we focus on what we need to do per iteration
            3. Looping type (sequential,concurrent) decided at runtime (polymorphism)
            4. but requires creating anonymous inner class, has lot of
                extra code

         */

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.print(value);
            }
        });

        /*
            Approach No. 4
            uses anonymous function but still extra code

         */

        values.forEach((Integer value)->System.out.print(value));

         /*
            Approach No. 5

            1. uses anonymous function but still extra code
            2. variable type no longer needed to pass
            3. but still extra code (unnecessary parameter value)

         */


         values.forEach(value->System.out.print(value));

         /*
            Approach No. 6

            1. uses method reference

            '::' used for method reference

         */

         values.forEach(System.out::print);

    }
}
