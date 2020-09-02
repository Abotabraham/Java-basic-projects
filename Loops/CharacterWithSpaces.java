package Loops;

public class CharacterWithSpaces {
    public static void main(String[] args) {
        String str = "The Game is on";

        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
