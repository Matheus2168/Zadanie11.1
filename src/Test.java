import java.util.Random;
import java.util.TreeSet;

public class Test {


    public static void main(String[] args) {


        TreeSet<Integer> set = new TreeSet<>();

        Random r = new Random();

        for (int i = 0 ; i < 50 ; i++){
            set.add(r.nextInt(1000));
        }


        System.out.println("najmniejsza: "+set.first());
        System.out.println("najwieksza: "+set.last());

        System.out.println("srednia: "+SetAssistant.average(set));

        System.out.println("wieksze od sredniej: "+SetAssistant.greaterThanAverage(set));

    }
}
