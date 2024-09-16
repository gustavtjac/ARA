public class BogstavFrekvens {

    public static int findAntal(String liste, String sekvens) {
        int svar = 0;
        for (int i = 0; i < liste.length() - 1; i++) {
            if ((liste.charAt(i) == sekvens.charAt(0)) && (liste.charAt(i+1) == sekvens.charAt(1))) {
                svar++;
            }

        }
        return svar;
    }


    public static void main(String[] args) {
String[] liste = {"hahahahahahahahahahaha", "lololololololololololololo", "gugugugugugugugugugu"};
String sekvenset = "ha";
String sekvensto = "lo";
String sekvenstre = "gu";

        System.out.println(findAntal(liste[1],sekvensto));
    }
}
