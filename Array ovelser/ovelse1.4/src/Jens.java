
public class Jens {

    public static void main(String[] args) {

        String[] names = {"Peter", "Sarita", "Jens", "Julie", "Jens"};

        for(int i = 0; i < names.length; i++){
            if (names[i].equals("Jens")){
                names[i] = "Jens\uD83D\uDD25";

            }
            System.out.println(names[i]);

        }


    }


}
