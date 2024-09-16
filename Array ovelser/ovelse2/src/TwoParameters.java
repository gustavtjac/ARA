import java.util.Arrays;
import java.util.Scanner;

public class TwoParameters {


    public static String rotteFunktion(String[]a, int b){
String navn = a[b-1];

return navn;
    }



    public static void main(String[] args) {

String[] kage = {"Otto", "amalie", "simon", "børge", "maximus"};

        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(kage));
        System.out.println("indtast det  nummer navn du vil fremhæve");
        System.out.println(rotteFunktion(kage,in.nextInt()));

    }

}
