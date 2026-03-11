import java.util.*;

class DivideAStringIntoGroupsOfSizeK {
    public static void main(String[] args) {
        DivideAStringIntoGroupsOfSizeK obj = new DivideAStringIntoGroupsOfSizeK();
        String s = "abcdefghijk";
        int k = 3;
        char fill = 'x';
        String[] str = obj.divideString(s, k, fill);
        for (String st : str) {
            System.out.print(st+" ");
        }
    }
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> list = new ArrayList<>();
        int strLen = s.length();
        //here we can know that in how many parts we can cut the string by 
        int parts = ( strLen + ( k - 1 ) ) / k;
        int val = k;
        int i = 0;
        while ( parts-- > 0 ) {
            if ( k > strLen ) {
                // int strToAdd = k - i - 1;
                // int strToAdd = strLen - i;
                int strToAdd = k - strLen;
                StringBuilder strAdd = new StringBuilder(s.substring(i));
                while ( strToAdd-- > 0 ) {
                    strAdd.append(Character.toString(fill));
                }
                list.add(strAdd.toString());
                break;
            }
            list.add(s.substring(i,k));
            i = k;
            k += val;
        }
        String[] str = list.toArray(new String[0]);
        return str;
    }
}