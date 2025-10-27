class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // i want answers for many strings stored in an array
        String[] testStrings = {"abc", "abcd", "xyz", "hello", "z"};
        for (String s : testStrings) {
            int result = sol.reverseDegree(s);
            System.out.println("The reverse degree of \"" + s + "\" is: " + result);
        }

    }
    public int reverseDegree(String s) {
        int index = 1;
        int len = s.length();
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (index > len) break;
            sum += ( (int)'z' - (int)c + 1 ) * index;
            index++;
        }
        return sum;
    }
}