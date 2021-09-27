import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution4 {

    public void printIntersection(int[] setA, int[] setB) {
        if (setA != null && setB != null) {
            Arrays.sort(setA);
            Arrays.sort(setB);

            List<Integer> arrayA = Arrays.stream(setA).boxed().collect(Collectors.toList());
            List<Integer> arrayB = Arrays.stream(setB).boxed().collect(Collectors.toList());

            arrayA.stream().filter(valueA -> arrayB.contains(valueA)).distinct().forEach(System.out::println);

        }
    }

}
