import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {

    public int solution(int[] A) {
        List<Integer> numeros = Arrays.stream(A).boxed().collect(Collectors.toList());
        int menorNumero = Collections.min(numeros);

        while (numeros.contains(Integer.valueOf(menorNumero)) || (!numeros.contains(Integer.valueOf(menorNumero)) && menorNumero <= 0)) {
            menorNumero++;
        }

        return menorNumero;
    }
}