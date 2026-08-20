class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i=0;
        int j=plants.length-1;
        int p1=capacityA;
        int p2=capacityB;
        int count=0;
        while(i<j){
            if(p1<plants[i]){
                count++;
                p1=capacityA;
            }
            p1-=plants[i];
            i++;
            if(p2<plants[j]){
                count++;
                p2=capacityB;
            }
            p2-=plants[j];
            j--;
        }
        if(i==j){
            int fin = Math.max(p1,p2);
            if(fin<plants[i])
            count++;
        }
        return count;
    }
}