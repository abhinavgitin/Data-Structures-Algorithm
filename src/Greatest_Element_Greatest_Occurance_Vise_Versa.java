import java.util.HashMap;

class Greatest_Element_Greatest_Occurance_Vise_Versa {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 5, 5, 2, 2, 3};
        Greatest_Element_Greatest_Occurance_Vise_Versa obj = new Greatest_Element_Greatest_Occurance_Vise_Versa();
        System.out.println("Difference: " + obj.findDiff(arr));
    }
    // Function to find the difference between the maximum and minimum frequency of
    // elements.
    public int findDiff(int[] arr) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num,0) + 1);
        }
            
        int maxFrequency = Integer.MIN_VALUE;
        int minFrequency = Integer.MAX_VALUE;
            
        for (int element : frequency.keySet()) {
            int count = frequency.get(element);
            if (count > maxFrequency) {
                maxFrequency = count;
            }
            if (count < minFrequency) {
                minFrequency = count;
            }
        }
        
        if (frequency.size() == 1) return 0;
        
        return maxFrequency - minFrequency;
    }
}