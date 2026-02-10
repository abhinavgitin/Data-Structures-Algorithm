public class FindAndReplaceInString {
    public static void main(String[] args) {
        FindAndReplaceInString findAndReplaceInString = new FindAndReplaceInString();
        String s = "abcd";
        int[] indices = {0,2};
        String[] sources = {"a","cd"};
        String[] targets = {"eee","ffff"};
        System.out.println(findAndReplaceInString.findReplaceString(s,indices,sources,targets));
    }
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        // the things to tackle is that check how much of the substring we need to extract form the string s 
        // that can be done by checking the length of the first indeces[i] and then the length of the first data or string stored 
        // into the sources like for eexample = sources[i] = "ab" so the length of the string there is 2 and 
        // thus we check the same length into the string s as per the indices
        // Check if the substring sources[i] occurs at index indices[i] in the original string s.
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for ( int i : indices ) {
            int lengthOfTheIndexString = sources[index].length();
            String str = s.substring(i,lengthOfTheIndexString);
            if ( str.equals(sources[index]) ) {
                sb.append(targets[index]);
                System.out.println(sb);
            } else {
                sb.append(str);
            }
            index++;
        }
        return sb.toString();
    }
}
