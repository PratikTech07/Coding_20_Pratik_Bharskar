public class Question11 {
    public static void main(String args[]){
        String str = "12@45Atpahbets";
        String result = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(result);
    }
}
