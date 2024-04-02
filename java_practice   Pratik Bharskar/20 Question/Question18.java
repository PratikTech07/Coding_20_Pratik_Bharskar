public class Question18 {
    public static void main(String args[]){
        String str = "Hello how are you ?";
        str = str.replaceAll("\\s*[^a-zA-z]" , "").toLowerCase();
        System.out.println(str);
        char ch[] = str.toCharArray();
        int cons = 0,vovl =0;
        for(int i = 0 ; i< ch.length; i++){
            if(ch[i] == 'a'||ch[i] == 'e'||ch[i] == 'i'||ch[i] == 'o'||ch[i] == 'u'){
                vovl++;
            }
            else
                cons++;
        }
        System.out.println("Vovles are "+vovl+" Consonents are "+cons);
    }
}
