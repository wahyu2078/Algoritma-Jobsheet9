public class PostFix29 {
    private int n;
    private int top;
    private char[] stack;

    public PostFix29(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOperator(char c) {
        if (c == '/' || c == '*' || c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String P = "";
        char c;
        int i = 0;
        while (i < n) {
            c = Q.charAt(i);
            if (isOperand(c)) {
                P = P + c;
            }
            if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (top != -1 && stack[top] != '(') {
                    P = P + pop();
                }
                if (top != -1) {
                    pop();
                }
            } else if (isOperator(c)) {
                while (top != -1 && derajat(stack[top]) >= derajat(c)) {
                    P = P + pop();
                }
                push(c);
            }
            i++;
        }
        while (top != -1) {
            P = P + pop();
        }
        return P;
    }

}