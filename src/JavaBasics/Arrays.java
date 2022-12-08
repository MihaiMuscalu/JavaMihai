package JavaBasics;

public class Arrays {
    public static void main(String[] args) {
        int[] arrays = new int[3];

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "");

        }
        System.out.println("");

        int[][] playGround = new int[4][3];


        playGround[0][0] = 1;
        playGround[2][1] = 2;

        System.out.println("------------");
        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround[row].length; col++) {
                System.out.print(playGround[row][col]);

            }
            System.out.println();

        }
    }
}
