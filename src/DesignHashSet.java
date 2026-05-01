import java.util.Arrays;
// anyone fix this code : when you see this :
// i am so confused with this 
// if not will try some other day and definately finish this while completing oops!
        
public class DesignHashSet {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(747);
        obj.add(56);
        obj.remove(2);
        boolean param_3 = obj.contains(747);
        System.out.println("Contains ? : "+param_3);
        System.out.println(obj.arr);
    }
    @Override
    public String toString() {
        MyHashSet obj = new MyHashSet();
        return "CustomArrayList{" + "size=" + obj.MAX_LENGTH + ", data=" + Arrays.toString(obj.arr) + '}';
    }
}

class MyHashSet {
    int MAX_LENGTH = 10;
    int currIndex;
    int arr[] = new int[MAX_LENGTH];
    public MyHashSet() {
        currIndex = 0;
    }
    
    public void add(int key) {
        if ( !contains(key) ) {
            this.arr[this.currIndex] = key;
            currIndex++;
        }
        if (currIndex == MAX_LENGTH) {
            MAX_LENGTH *= 2;
        }
    }

    public void remove(int key) {
        for ( int i = 0 ; i < currIndex ; i++ ) {
            if ( this.arr[i] == key ) {
                this.arr[i] = 0;
                for ( int j = i+1 ; j < this.arr.length ; j++ ) {
                    // we shift the right element to the left
                    this.arr[j-1] = this.arr[j];
                }
                currIndex--;
                break;
            }
        }
    }

    public boolean contains(int key) {
        for ( int i = 0 ; i < this.arr.length ; i++ ) {
            if ( this.arr[i] == key ) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * 
 */