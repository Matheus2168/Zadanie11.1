import java.util.TreeSet;

public class SetAssistant {


    public static double average(TreeSet<Integer> set){

        long sum = 0;

        for (Integer integer : set) {
            sum += integer;
        }
        double average = (double) (sum / set.size());

        return average;
    }

    public static TreeSet<Integer> greaterThanAverage (TreeSet<Integer> set){
        double average = average(set);
        TreeSet<Integer>greaterThanAverage = new TreeSet<>();

        for (Integer integer : set) {
            if (integer > average){
                greaterThanAverage.add(integer);
            }
        }

        return greaterThanAverage;
    }

}
