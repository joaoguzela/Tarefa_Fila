import java.util.Random;
public class MainTeste {
    public static void main(String[] args) {
        Fila f = new Fila();
        int max = 10, result, n;
        Random random = new Random();

        try {
            for (int i = 0; i < max; i++) {
            	result = Math.abs(random.nextInt() % max);
                f.push(result, i);
            }
            f.imprimir();
            f.pop();
            System.out.println("---------------------------------");
            f.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}