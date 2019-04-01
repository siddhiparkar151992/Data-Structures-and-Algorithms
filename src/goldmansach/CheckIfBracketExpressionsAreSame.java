package goldmansach;

/**
 * Created by Siddhi Parkar on 16-11-2017.
 */
public class CheckIfBracketExpressionsAreSame {

    public static void main(String[] args) {
        System.out.println(isSame("-a+(b+c)", "-a+b+c"));
    }

    public static boolean isSame(String expr1, String expr2) {
        int i = 0;
        int j = 0;
        char toChange = '#';
        while (i < expr1.length() && j < expr2.length()) {
            char c1 = expr1.charAt(i);
            char c2 = expr2.charAt(j);

            if (c1 == '(') {
                toChange = expr1.charAt(i-1);
                i++;
            } else if (c1 == ')') {
                toChange = '#';
                i++;
            } else {
                if (toChange != '#' && (c1 == '+' || c1 == '-') && (c2 == '+' || c2 == '-')){
                        if(toChange== '-' && ((c1 == '-' && c2!='+') || (c1=='+' && c2!='-'))) {
                            System.out.println("invalid");
                            return false;
                        }
                }else if(c1!=c2) {
                    System.out.println("invalid");
                    return false;
                }
                i++;
                j++;
            }
        }
        return true;
    }
}
