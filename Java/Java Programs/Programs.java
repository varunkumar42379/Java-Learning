import java.util.function.BiConsumer;
public class Programs {
    public static void main(String[] args) {
       BiConsumer<Integer,Integer>add = (a , b) -> {
           System.out.println(a+b);
       };
       add.accept(5,7);
    }

}
