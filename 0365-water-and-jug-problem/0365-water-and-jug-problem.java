class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {

        if (targetCapacity > jug1Capacity + jug2Capacity)
            return false;

        int gcd = findGCD(jug1Capacity, jug2Capacity);

        return targetCapacity % gcd == 0;
    }

    int findGCD(int a, int b) {

        while (b != 0) {

            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}