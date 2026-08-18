class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> st = new LinkedList<>();
        Queue<Integer> sd = new LinkedList<>();

        for(int i=0;i<students.length;i++)
            st.offer(students[i]);

        for(int i=0;i<sandwiches.length;i++)
            sd.offer(sandwiches[i]);

        int count = 0;

        while(!st.isEmpty() && count < st.size()) {

            if(st.peek() == sd.peek()) {
                st.poll();
                sd.poll();
                count = 0;
            }
            else {
                st.offer(st.poll());
                count++;
            }
        }

        return st.size();
    }
}