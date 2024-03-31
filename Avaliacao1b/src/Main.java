
public class Main {

    public static boolean ePalidrome(String str) {
        String cleanStr = str.toLowerCase().replace("[^a-zA-Z0-9]","");

        int length = cleanStr.length();
        for (int i =0; i < length/ 2; i++){
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "arara";
        boolean ePalidrome = ePalidrome(str);
        System.out.println("A Palavra '"+ str +" é palindroma? " + (ePalidrome ? "Sim" : "Não"));
    }
}