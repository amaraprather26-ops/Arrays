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
        average();
        maxNum();
        maxIndex();
    }

    public void displayArray(){
        for(int x = 0; x<nums.length; x=x+1){
            System.out.println(x+": "+nums[x]);
        }
    }

    public void sumArray(){
        int sum = 0;
        for(int z= 0; z < nums.length; z++){
            sum = sum + nums[z];
        }
        System.out.println(sum);
    }

    public void average(){
        int average = sum/nums.length;
        System.out.println(average);
    }

    public void minNum(){

    }

    public void maxNum(){
         int max = nums[0];
        for (int i=0;i<nums.length; i++){
            max = Math.max(max, nums[i]);

            if (nums[i]> max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public void maxIndex(){
        int index  = 0;
        int max = 0;
        for (int i = 0; i< nums.length; i++ ){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        System.out.println("index:" + index);

    }
}
