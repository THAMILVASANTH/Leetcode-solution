class Solution {
    
    private Map<String, List<Integer>> memo = new HashMap<>();

    public List<Integer> diffWaysToCompute(String input) {
        if (memo.containsKey(input)) {
            return memo.get(input);
        }

        List<Integer> results = computeResults(input);
        memo.put(input, results);
        return results;
    }

    private List<Integer> computeResults(String input) {
        List<Integer> results = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '-' || ch == '*' || ch == '+') {
                String leftPart = input.substring(0, i);
                String rightPart = input.substring(i + 1);

                List<Integer> leftResults = diffWaysToCompute(leftPart);
                List<Integer> rightResults = diffWaysToCompute(rightPart);

                for (Integer left : leftResults) {
                    for (Integer right : rightResults) {
                        int computation = 0;
                        switch (ch) {
                            case '+': computation = left + right;
                                break;
                            case '-': computation = left - right;
                                break;
                            case '*': computation = left * right;
                                break;
                        }
                        results.add(computation);
                    }
                }
            }
        }
        if (results.isEmpty()) {
            results.add(Integer.valueOf(input));
        }
        return results;
    }
}
