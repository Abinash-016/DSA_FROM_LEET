class Solution {
    public boolean judgeCircle(String moves) {
        // char[] ch = moves.toCharArray();
        // int[] arr = new int[ch.length];
        // for (int i = 0; i < ch.length; i++) {
        //     if (ch[i] == 'U')
        //         arr[i] = 1;
        //     if (ch[i] == 'D')
        //         arr[i] = -1;
        //     if (ch[i] == 'L')
        //         arr[i] = 2;
        //     else if (ch[i]== 'R')
        //         arr[i] = -2;
        // }
        // int sum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        // return sum==0;


        int x=0, y=0;

        for(char ch: moves.toCharArray()){
            if(ch== 'U') x++;
            else if(ch== 'D') x--;
            else if(ch== 'L') y++;
            else if(ch== 'R') y--;
        }
        return x==0 && y==0;
    }
}