class Solution {
    public int maxDistance(int[] colors) {
        int maxDist = 0;

        for (int i = 0; i < colors.length; i++) {
            for (int j = colors.length - 1; j >= 0; j--) {
                if (colors[i] != colors[j]) {
                    maxDist = Math.max(maxDist, Math.abs(j - i));
                }
            }
        }
        return maxDist;
    }
}