import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        int i = 0;
        for(i = (args.length - 1); i >= 0; i--){
           System.out.print(args[i] + " ");
        }
     }
}