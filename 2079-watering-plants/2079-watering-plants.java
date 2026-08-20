class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int cap = capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>cap){
                count+=2*i;
                cap=capacity;
            }
            cap-=plants[i];
            count++;
        }
        return count;
    }
}