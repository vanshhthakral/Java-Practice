public class SecondLargest {
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8,9,10};
        int i,num,num2=0;
        num=A[0];
        for (i = 1; i < A.length; i++) {
            if (A[i] > num) {
                num2 = num;
                num = A[i];
            } 
            else if (A[i] > num2) {
                num2 = A[i];
            }
        }
        System.out.println("Second largest number: " + num2);
    }
    }