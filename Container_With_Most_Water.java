class Container_With_Most_Water{
    public int maxArea(int[] height) {
        int ans=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            ans = Math.max(ans, (end-start) * Math.min(height[start], height[end]));
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return ans;
    }
}