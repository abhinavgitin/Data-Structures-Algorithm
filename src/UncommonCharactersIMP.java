import java.util.*;

class UncommonCharactersIMP {
    String uncommonChars(String s1, String s2) {
        // code here
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for ( char c1 : s1.toCharArray() ) set1.add(c1);       
        for ( char c2 : s2.toCharArray() ) set2.add(c2);    
        ArrayList<Character> list = new ArrayList<>();
        for ( char ch1 : set1 ) {
            if ( !set2.contains(ch1) ) list.add(ch1);
        }
        for ( char ch2 : set2 ) {
            if ( !set1.contains(ch2) ) list.add(ch2);
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for ( char c : list ) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        UncommonCharactersIMP obj = new UncommonCharactersIMP();
        System.out.println(obj.uncommonChars(s1, s2));
        sc.close();
    }
}