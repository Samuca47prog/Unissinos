import java.util.Stack;

public class Etapa3 {
    public static void main(String[] args) {

        // Estapa 3.1
        StaticList<Integer> list = new StaticList<Integer>(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(0);

        System.out.println(list.contaElementos(3));

        // Etapa 3.2
        System.out.println("Etapa 3.2:");

        String str1 = "((A+B)";
        System.out.println(str1 + " false == " + checkBrackets(str1));

        String str2 = "A+B(";
        System.out.println(str2 + " false == " + checkBrackets(str2));

        String str3 = ")A+B(-C";
        System.out.println(str3 + " false == " + checkBrackets(str3));

        String str4 = "(A+B))-(C+D";
        System.out.println(str4 + " false == " + checkBrackets(str4));

        String str5 = "((A+B)-(C+D))";
        System.out.println(str5 + " true == " + checkBrackets(str5));



    }

    public static boolean checkBrackets(String str){
        char[] strAsCharArray = str.toCharArray();
        StaticStack<Character> stack = new StaticStack<Character>(strAsCharArray.length);

        for (Character c : strAsCharArray) {
            stack.push(c);
        }

        return checkBrackets(stack);
    }

    public static boolean checkBrackets(StaticStack<Character> s1) {
        StaticStack<Character> bracketsStack = new StaticStack<>(s1.numElements());
        int openCount = 0;
        int closeCount = 0;

        while (!s1.isEmpty()) {
            char currentChar = s1.pop();
            if (currentChar == ')') {
                closeCount++;
                bracketsStack.push(currentChar);
            } else if (currentChar == '(') {
                openCount++;
                if (!bracketsStack.isEmpty() && bracketsStack.top() == ')') {
                    bracketsStack.pop();
                } else {
                    return false;
                }
            }
        }

        return openCount == closeCount;
    }
}
