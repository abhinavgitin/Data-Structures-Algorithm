class StringWithoutAAAOrBBB {
    public static void main(String[] args) {
        StringWithoutAAAOrBBB obj = new StringWithoutAAAOrBBB();
        System.out.println(obj.strWithout3a3b(1, 3));
    }

    public String strWithout3a3b(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (a > 0 || b > 0) {
            if (idx > 1 && sb.charAt(idx - 1) == sb.charAt(idx - 2)) {
                if (sb.charAt(idx - 1) == 'a') {
                    sb.append("b");
                    b--;
                } else {
                    sb.append("a");
                    a--;
                }
                idx++;
                continue;
            }
            if (a > b) {
                sb.append("a");
                a--;
            } else {
                sb.append("b");
                b--;
            }
            idx++;
        }
        return sb.toString();
    }
}