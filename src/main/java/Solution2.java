import java.util.ArrayList;
import java.util.List;

public class Solution2 {

    public List<String> solution(int[] numeros, int valorRetornar) {
        List<String> resultado = new ArrayList<>();

        for (int x = 0; x < numeros.length; x++) {
            for (int y = 1; y < numeros.length; y++) {
                if ((numeros[x] + numeros[y]) == valorRetornar) {
                    resultado.add("[" + numeros[x] + " ," + numeros[y] + "]");
                }
            }
        }

        return resultado;
    }

}
