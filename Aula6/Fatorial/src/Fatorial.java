public class Fatorial {

    private int n;

    public Fatorial(int n) {
        this.n = n;
    }

    public static int fat(int n) {
        int i = 2;
        int result = 1;

        if(n < 0) {
            return -1;
        }
        while (i <= n) {
            result = result*i;
            i++;
        }
        return result;
    }
}