package data_structures.stack;


public class ParenthesisMatching {
    public boolean ParensMatch(char[] tokens, int arrSize) {
        char[] referenceParens = new char[]{'[', '(', '{'};
        Stack<Character> openParens = new ArrayStack<Character>(tokens.length/2);
        for(int i = 0; i < arrSize; i++) {
            for(int j = 0; j < referenceParens.length; j++) {
                if (tokens[i] == referenceParens[j]) {
                    openParens.push(tokens[i]);
                    break;
                }
            }

            Character opener = openParens.top();
            if(tokens[i] == ']' && opener == '[') {
                openParens.pop();
            } else if(tokens[i] == '}' && opener == '{') {
                openParens.pop();
            } else if(tokens[i] == ')' && opener == '(') {
                openParens.pop();
            } 
        }
        if (openParens.isEmpty()) {
            return true;
        }
        return false;
    }
}