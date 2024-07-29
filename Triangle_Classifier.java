import java.util.Scanner;

public class Triangle_Classifier {
    public static void main(String[] args) {
        int side_1 = 5;
        int side_2 = 10;
        int side_3 = 15;
        if(side_1 == side_2 && side_1 == side_3) {
            System.out.println("Equilateral Triangle");
        } else if (side_1 == side_2 || side_2 == side_3 || side_3 == side_1) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
