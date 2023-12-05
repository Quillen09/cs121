package week4;

public class forLoops {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        //for(initialization ; condition ; incrementing/ decrementing)
        for(int n = 0; n<numbers.length; n++){
            System.out.println(numbers[n]);
        }
        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i++){
            if (i %2 == 0){
                System.out.println(i);
            }
        }
    }
}
