class ContainersWithMostWater{
    public static void main(String[] args) {
        ContainersWithMostWater c = new ContainersWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(c.maxArea(height));
    }
    public int maxArea(int[] height) {
        int start = 1;
        int end = height.length;
        int res = 0;
        while ( start <= end ){
            int minHeight = Math.min(height[start-1],height[end-1]);
            res = Math.max((end - start) * minHeight,res);
            if ( minHeight == height[start-1] ){
                start++;
            } else {
                end--;
            }
        }
        return Math.abs(res);
    }
}