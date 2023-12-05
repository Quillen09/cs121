package week9;

public class array {
    public static void main(String[] args) {
        String name = "Name";
        String name2 = "NName";
        String [] name3 = new String [3];
        int [] years;
        years = new int[5];
        float [] pay = new float[4];
        final int maxCap = 30;
        int [] classSize = new int[maxCap];

        String[] names = {"libby", "jacob", "jess", "john"};
        System.out.println(names[0]);
        for(int i = 0; i<4; i++){
            System.out.println(names[i]);
        }

    }
}
