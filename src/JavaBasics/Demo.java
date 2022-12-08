package JavaBasics;

public class Demo {
    static char[] alphabet = {'a', 'b', 'c'};

    public static void main(String[] args) {
        String name = "Andreas";

        System.out.println(getPositionOfCharacer('x'));





    }

    public static int getPositionOfCharacer(char character){
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i]==character){
                return i;
            }
        }
        return -1;
    }
}
