public class Demo {
    public static void main(String[] args) {
        int nums[][] = new int[3][]; // jagged array
        
        // different sizes of an array
        nums[0] = new int[2];
        nums[1] = new int[3];
        nums[2] = new int[4];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }

       
        

    }
}
