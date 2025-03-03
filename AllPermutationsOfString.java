package StringProgram;

public class AllPermutationsOfString {

public static void AllPermutationsOfString(String str, String prefix){

    if (str.length()==0)
    {
        System.out.println(prefix);
    }else {
        for (int i=0;i<str.length();i++){
            String rem=str.substring(0,i) + str.substring(i+1);
            AllPermutationsOfString(rem,prefix+str.charAt(i));
        }
    }
}
    public static void main(String[]args)
    {
        String str= "Rohit";
        AllPermutationsOfString(str,"");
    }
}
