
public class GreatestOfThree {
    public static void main(String[] args) {

        int num1 = 11;
        int num2 = 5;
        int num3 = 3;
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println("The greatest number is: " + greatest);
       }
    }

