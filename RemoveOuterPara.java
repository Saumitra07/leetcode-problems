import java.util.Stack;

public class RemoveOuterPara {

    public static String removeOuterParentheses(String s) {
        StringBuilder res= new StringBuilder();
        int count=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                count++;
            }
            else
            {
                count--;

            }
            if(count==0)
            {
                res.append(s.substring(start+1,i));
                start=i+1;

            }
        }


        return res.toString();
    }
    public static void main(String[] args) {
        String s="(()())";
        System.out.println(removeOuterParentheses(s));

    }
}
