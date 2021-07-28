package written_examination.autumn.autumn01_NIO;

public class NIO03_Find_3 {
    public boolean Find(int target, int [][] array) {
        int row = array.length - 1, col = 0;
        while(row >= 0 && col < array[row].length){
            if(array[row][col] > target){
                row--;
            }else if(array[row][col] < target){
                col ++;
            }return true;
        }
        return false;
    }
}
