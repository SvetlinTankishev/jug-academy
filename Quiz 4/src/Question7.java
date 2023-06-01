import java.util.stream.Stream;

public class Question7 {
    static int x;
    static {
        x = 10;
        int result = Stream.of(10, 20, 30, 40)
                .map((y) -> {
                    x += y;
                    return x;
                })
                .reduce(x, (a, b) -> {
                    return a + b;
                });
        System.out.println(result);
    }

    public static void main(String[] args) {

    }

}
