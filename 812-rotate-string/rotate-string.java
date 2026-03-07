class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        int n=s.length();

        String doubleS= s + s;
        return doubleS.contains(goal);
    }
}