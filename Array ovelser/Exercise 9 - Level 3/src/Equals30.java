import java.util.Arrays;
import java.util.Random;

public class Equals30 {

    public static boolean equals30(int[] a){
int update = 0;
for (int i = 0; i <= a.length -1 ; i++){
    update = a[i] + update;

}
if (update == 30){
    return true;
}
return false;

    }


    public static void main(String[] args) {
Random tilfældig = new Random();
boolean start = true;
while (start) {
    int[] tal = {10,10,32,3220,424};
    String hej = Arrays.toString(tal);
    System.out.println("her har du dine tal:");
    System.out.println(hej);
    System.out.println("giver dine tal 30???");
    System.out.println(equals30(tal));
    if (equals30(tal)){
        start = false;

    }

}
    }
}
