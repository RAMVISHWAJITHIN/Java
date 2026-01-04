public class Product_itself {

    public static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int mult = 1;
            if (j != i) {
                mult = mult * nums[i];

            }
            product[j] = mult;

        }

        j++;
        return product;
    }
    /*
     * 
     * 
     * int i=0;
     * int j=0
     * loop not run.
     * 
     * int i=1;
     * j=0
     * mult=1*nums[1];
     * =1*2=2
     * product[0]=2;
     * int i=2;
     * j=0;
     * mult=2*nums[2]
     * =2*3=6;
     * int i=3
     * j=0
     * mult=6*nums[3]
     * =6*4
     * =24
     * 
     * int j=1;
     * i=0
     * 
     */

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(productExceptSelf(nums));
    }

}
