package arrays;

public class TowDimensionalArray {
    public static void main(String[] args) {
        String names [][] = {{"nat", "Sam", "Bil"}, {"Chris,","Fid", "Grace"}, {"Foyd", "Charles", "James", "Ben"}};
        System.out.println(names[2][1]);

        for(int row = 0; row < names.length; row++) {
            for(int col=0; col<names[row].length; col++){
                System.out.print(names[row][col] + " ");
            }
            System.out.println();
        }
    }
}
