package java.Preparation.GenericQuestions;

public class reverseExmp1 {
    public static void main(String[] args) {
        String str="123";
        System.out.println(reverse(str));
    }

   static String reverse(String d){
        char[]c = d.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            sb.append(c[i]);
        }
        return sb.toString();
    }
}
