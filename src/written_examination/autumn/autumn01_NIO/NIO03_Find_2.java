package written_examination.autumn.autumn01_NIO;

public class NIO03_Find_2 {
    public boolean Find(int target, int [][] array) {

        int row = array.length;
        if(row <= 0){
            return false;
        }
        for(int i = row-1; i >= 0; i--){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == target){
                    return true;
                }if(array[i][j] > target){
                    break;
                }
            }
        }
        return false;
    }
}
