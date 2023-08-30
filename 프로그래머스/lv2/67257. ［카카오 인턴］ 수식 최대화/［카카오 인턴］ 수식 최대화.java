import java.util.*;

class Solution {
    private static final String[][] precedences = {
        "+-*".split(""),
        "+*-".split(""),
        "*+-".split(""),
        "*-+".split(""),
        "-*+".split(""),
        "-+*".split("")
    };
    
    private long calculate(long lhs, long rhs, String op) {
        return switch (op) {
                case "+" -> lhs + rhs;
                case "-" -> lhs - rhs;
                case "*" -> lhs * rhs;
                default -> 0;
        };
    }
    
    private long calculate(List<String> tokens, String[] precedence) {
        for(String op : precedence) {
            for(int i = 0; i < tokens.size(); i++) {
                if(tokens.get(i).equals(op)) {
                    long lhs = Long.parseLong(tokens.get(i - 1));
                    long rhs = Long.parseLong(tokens.get(i + 1));
                    long result = calculate(lhs, rhs, op);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i - 1, String.valueOf(result));
                    i -= 2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }
    
    public long solution(String expression) {
        //stringtokenizer를 이용해서 문자열을 연산자 포함 분리
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        //token들을 리스트에다가 옮겨 담기 (list에 문자열 배열로 하나씩 담겨짐)
        while(tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        long answer = 0;
        long max = 0;
        
        for(String[] precedence : precedences) {
            long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
            if(value > max) {
                max = value;
            }
        }
        
        answer = max;
        
        return answer;
    }
}