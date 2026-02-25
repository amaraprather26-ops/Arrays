public class Arrays {
    public int sum;
    public int[] nums;

    public static void main(String[] args) {
        System.out.println("Arrays");
        new Arrays();
    }

    public Arrays(){
        nums = new int[10];//10 buckets labeled 0-9
        for(int y = 0; y<nums.length; y++){
            nums[y] = (int)(Math.random()*100)+1;
        }
        displayArray();
        sumArray();
    }

    public void displayArray(){
        for(int x = 0; x<nums.length; x=x+1){
            System.out.println(x+": "+nums[x]);
        }
    }

    public void sumArray(){
        sum = 0;
        for(int z= 0; z < nums.length; z++){
            sum = sum + nums[z];
        }
        System.out.println(sum);
    }

    public void largestNum(){

    }
}
