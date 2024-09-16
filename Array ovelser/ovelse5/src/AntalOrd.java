public class AntalOrd {

    public static int hvorMangeOrd(String a){
        int svar = 0;
        for (int i = 0; i < a.length(); i++){
            if (a.charAt(i) == ' '){
                svar = svar + 1;
            }}
return svar + 1;
    }

    public static void main(String[] args) {

        System.out.println("Der er så mange ord: " + hvorMangeOrd("Aaron and jeremy wants to fuck"));
    }
}
