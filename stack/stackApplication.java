import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

class ValidBrackets {
    private static final Map<Character, Character> bracketsPair=Map.of(
            ')','(',
            '}','{',
            ']','['
    );
    public boolean checkValid(@NotNull String brackets){
        Stack<Character> s=new Stack<>();
        for(char c:brackets.toCharArray()){
            if(bracketsPair.containsValue(c)){
                s.push(c);
            }else if(bracketsPair.containsKey(c)) {
                if (s.isEmpty() || s.pop() != bracketsPair.get(c)) return false;
            }
        }
        return s.isEmpty();
    }
}
class InfixToPostfix {
    public String infixtopostfix(String infixexp){
        Stack<Character> s=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<infixexp.length();i++){
            char c=infixexp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }else if(c=='('){
                s.push('(');
            }else if(c==')'){
                while(!s.isEmpty() && s.peek()!='(') {
                    sb.append(s.pop());
                }
                if(!s.isEmpty()){
                    s.pop();
                }
            }else if(isOperator(c)){
                while(!s.isEmpty() && getPriority(s.peek())>=getPriority(c)){
                    sb.append(s.pop());
                }
                s.push(c);
            }else{
                sb.append(c);
            }

        }
        while(!s.isEmpty()){
            if(s.peek()=='(') return "Invalid Infix Expression";
            sb.append(s.pop());
        }
        return sb.toString();
    }
    private int getPriority(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/', '%' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }
    private boolean isOperator(char op){
        return op == '+' || op == '-' || op == '*' || op == '/' || op == '%';
    }
}
class InfixToprefix {
    public @NotNull String reverse(@NotNull String infixexp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < infixexp.length(); i++) {
            char x = infixexp.charAt(i);
            if (x==')') {
                sb.append('(');
            } else if (x == '(') {
                sb.append(')');
            } else {
                sb.append(x);
            }
        }
        return sb.reverse().toString();
    }

    private boolean isBalnced(@NotNull String infixexp) {
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < infixexp.length(); i++) {
            char c=infixexp.charAt(i);
            if(c=='('){
                s.push(c);
            }else if(c==')'){
                if (s.isEmpty()) return false;
                s.pop();
            }
        }
        return s.isEmpty();
    }

    private int getPriority(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/', '%' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    private boolean isOperator(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op == '^';
    }

    private @NotNull String prefixPostfix(@NotNull String infixexp) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < infixexp.length(); i++) {
            char c = infixexp.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            } else if (c == '(') {
                s.push('(');
            } else if (c == ')') {
                while(!s.isEmpty() && s.peek()!='(') {
                    sb.append(s.pop());
                }
                if(!s.isEmpty()){
                    s.pop();
                }
            }else if (isOperator(c)) {
                while (!s.isEmpty() && getPriority(s.peek()) > getPriority(c) ||
                        (!s.isEmpty() && getPriority(s.peek()) == getPriority(c) && c!='^')) {
                    sb.append(s.pop());
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()) {
            if(s.peek()=='(') return "Invalid Infix Expression";
            sb.append(s.pop());
        }
        return sb.toString();
    }

    public String infixtoprefix(String infixexp) {
        if(!isBalnced(infixexp)){
            return "Bracket isn't balanced:Invalid Expression";
        }
        infixexp = reverse(infixexp);
        infixexp = prefixPostfix(infixexp);
        return reverse(infixexp);
    }
}
class EvaluateExpression {
    private int operator(int x,int y,char v){
        return switch (v) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            case '/' -> {
                if (y == 0) yield -1;
                yield x / y;
            }
            case '%' -> x % y;
            case '^' -> (int)Math.pow(x,y);
            default -> -1;
        };
    }
    private boolean isoperator(char v){
        return (v=='+' || v=='-' || v=='*' || v=='/' || v=='%');
    }
    private boolean isNumber(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public int evaluatePostfix(@NotNull String exp){
        Stack<Integer> s=new Stack<>();
        String[] tokens=exp.split("\\s+");
        for(String token:tokens){
            if(isNumber(token)){
                s.push(Integer.parseInt(token));
            }else if(isoperator(token.charAt(0))) {
                if(s.size()<2) return -1;
                int y=s.pop();
                int x=s.pop();
                int z = operator(x, y, token.charAt(0));
                if (z == -1) {
                    System.out.println("Cant divide by zero or invalid expression");
                    return -1;
                } else {
                    s.push(z);
                }
            }
        }
        return s.isEmpty()?-1:s.pop();
    }
    public int evaluatePrefix(String exp){
        return -1;
    }

}

class TowerOfHanoi{
    public void solvehanoi(int n, char s, char d, char aux) {
        if(n==1){
            System.out.println("Disk "+n+": "+s+" -> "+d);
            return;
        }
        solvehanoi(n-1,s,aux,d);
        System.out.println("Disk "+n+": "+s+" -> "+d);
        solvehanoi(n-1,aux,d,s);
    }
}

public class stackApplication{
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INSIDE STACK APPLICATION");
        while(true){
            System.out.println("1.Check Valid Brackets\n2.INFIX to POSTFIX Expression\n3.INFIX to PREFIX Expression\n4.Evaluate Expression\n5.Tower of Hanoi\n6.EXIT\n");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 6) break;
            switch(choice){
                case 1:
                    ValidBrackets objVB = new ValidBrackets();
                    System.out.println("Enter Expression which include Brackets({},[].())");
                    String bracketExpression = sc.nextLine().trim();
                    if(bracketExpression.isEmpty()) {
                        System.out.println("Invalid Expression");
                        break;
                    }
                    if (objVB.checkValid(bracketExpression)){
                        System.out.println("Brackets Match");
                    }else{
                        System.out.println("Brackets Not Match");
                    }
                    break;
                case 2:
                    InfixToPostfix objPost = new InfixToPostfix();
                    System.out.println("""
                            Enter  Mathematical Expression which includes:
                            1.Numbers (0..9)/Alphabet(a..z || A..Z)\s
                            2.Operators(+,-,*,/,%,^)\s
                            3.Brackets ->only allowed bracket is ()\s""");
                    String infixExpression = sc.nextLine().trim();

                    if(infixExpression.isEmpty()){
                        System.out.println("Invalid Expression");
                        break;
                    }else{
                        String postfixExp = objPost.infixtopostfix(infixExpression);
                        System.out.println("POSTFIX :"+postfixExp);
                    }
                    break;
                case 3:
                    InfixToprefix objpre = new InfixToprefix();
                    System.out.println("""
                            Enter  Mathematical Expression which includes:
                            1.Numbers (0..9)/Alphabet(a..z || A..Z)\s
                            2.Operators(+,-,*,/,%,^)\s
                            3.Brackets ->only allowed bracket is ()\s""");
                    String infixExp = sc.nextLine().trim();
                    if(infixExp.isEmpty()){
                        System.out.println("Invalid Expression");
                        break;
                    }else{
                        String prefixExp=objpre.infixtoprefix(infixExp);
                        System.out.println("Prefix :"+prefixExp);
                    }
                    break;
                case 4:
                    EvaluateExpression objEval=new EvaluateExpression();
                    System.out.println("Type of Expression : 1.POSTFIX\t2.PREFIX");
                    int which=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Expression in Mathematical Equation format:");
                    String equation=sc.nextLine().trim();
                    if(equation.isEmpty()){
                        System.out.println("Invalid Equation");
                    }else{
                        int ans;
                        if(which==1){
                            ans=objEval.evaluatePostfix(equation);
                        }else if(which==2){
                            ans=objEval.evaluatePrefix(equation);
                        }else{
                            System.out.println("Invalid Choice!");
                            return;
                        }
                        if(ans==-1) {
                            System.out.println("Expression :"+ans +"is incorrect !");
                        }else{
                            System.out.println("Evaluated Expression Value :"+ans);
                        }
                    }
                    break;
                case 5:
                    TowerOfHanoi toh=new TowerOfHanoi();
                    System.out.println("Enter number of disks :");
                    int disk=sc.nextInt();
                    sc.nextLine();
                    if(disk<=0){
                        System.out.println("Invalid Number");
                        break;
                    }
                    toh.solvehanoi(disk,'A','C','B');   //A-source      C-destination  B-auxiliary
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
            System.out.println("To CONTINUE or EXIT(Press y)");
            if(!(sc.next().equals("y"))) break;
        }
        sc.close();
    }
}