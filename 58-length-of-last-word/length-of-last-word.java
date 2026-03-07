class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        char[] ch = s.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            if (ch[i] == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}