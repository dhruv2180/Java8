import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        /*

            Complex as manage variable, boundry conditions
            uses external iterator
         */

        for (int i = 0; i < values.size(); i++) {

            System.out.print(values.get(i));
        }

        /*
            Simpler since lesser moving parts, but still complex since uses
            external iterators

         */

        for (int i:values){
            System.out.print(i);
        }


        /*
            Internal iterator approach, management of iterator done by automatically
            by the collection we focus on what we need to do per iteration

            Looping  decided at runtime (polymorphism)
         */

        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        });
    }
}
