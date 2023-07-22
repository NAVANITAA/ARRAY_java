import java.util.*;

public class callByArgument {
    public static void updatemarks(int marks[], int unchangable) {
        unchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        int unchangable = 5;

        updatemarks(marks, unchangable);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println(unchangable);
    }
}