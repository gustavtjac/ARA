import java.util.Arrays;

public class Ovelse4 {


    public static int mindsteInt(int[] a){

int mikroInt = Arrays.stream(a).min().getAsInt();


return mikroInt;

    }


    public static void main(String[] args) {
int[] talRække = {999,888,666,111};
        System.out.println(mindsteInt(talRække));


    }


}
