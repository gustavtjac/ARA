import java.util.ArrayList;
import java.util.Arrays;

public class AveragValueMinusHighLow {

    public static double arrayAverage(int[] array){
        double svar = 0;
        for (int i = 0; i < array.length; i++){
            if (i>= 1 && i<=array.length-2){
                svar = svar + array[i];

            }
        }


svar = svar / (array.length -2);
        return svar;
    }




    public static void main(String[] args) {
        int[] talRække = {9,4,1,55,33,2,1,677,43,44,22,434,4234,42342342,1,999999999};

        System.out.println(arrayAverage(talRække));

    }


}
