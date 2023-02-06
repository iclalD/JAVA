import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        VirtualPlayer v = new VirtualPlayer(leap,game);
        v.tick();
        return v.winnable;

    }


    static class VirtualPlayer {
        private int i = 0;
        private int leap;
        private int[] arr;
        boolean winnable = false;
        public VirtualPlayer(int leap, int[] arr){
            this.leap = leap;
            this.arr = arr;
        }
        private void moveup(){
            if(arr[i +1]==0){
                i++;
                tick();
            }
        }

        private void movedown(){
            if((i - 1) >= 0 && arr[i - 1] == 0){
                arr[i] = 1;
                i--;
                tick();
            }
        }

        private void jump(){
            if((i + leap) < arr.length){
                if(arr[i + leap] == 0){
                    int oldi = i;
                    i = i + leap;
                    tick();
                    i = oldi;
                }
            }
        }

        void tick() {

            if(i == (arr.length - 1) || ((i + leap) >= arr.length)){
                winnable = true;
            }
            else {
                this.moveup();
                if(leap !=0){
                    this.jump();
                }
                this.movedown();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
