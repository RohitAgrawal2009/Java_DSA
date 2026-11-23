class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];

            if (op.equals("+")) {
                int last = st.pop();
                int sumOfLastTwo = last + st.peek();
                st.push(last);
                st.push(sumOfLastTwo);
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
            } else if (op.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int total = 0;
        for (int score : st) {
            total += score;
        }
        return total;
    }
}