public class Arrays {
    public int sum;
    public int[] nums;
    public Star[] stars;

    public static void main(String[] args) {
        System.out.println("Arrays");
        new Arrays();
    }

    public Arrays(){
        nums = new int[10];//10 buckets labeled 0-9

        stars = new Star[7];
        stars[0] = new Star();
        Star s1 = new Star();
       stars[0].printInfo();
       s1.color  = "blue";
       s1.points = 5;
       s1.printInfo();
       stars[0].color = "white";

       for (int i = 0; i<stars.length; i++){
           stars[i] = new Star();
        }

       for (int x=0; x<stars.length; x++){
           stars[x].points = (int)(Math.random()*11);
       }


        for(int y = 0; y<nums.length; y++){
            nums[y] = (int)(Math.random()*100)+1;
        }
        //displayArray();
        //sumArray();
        //average();
        //maxNum();
        //maxIndex();
        //greaterThan50();
        displayStars();
    }

    public void displayStars(){
        for(int i=0; i<stars.length; i++){
            stars[i].printInfo();
        }
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
        System.out.println("max index: " + index);

    }
    public void greaterThan50(){
        int over50 = 0;

        for (int i = 0; i<nums.length; i=i+1) {
            if (nums[i] > 50) {
                over50 = over50 + 1;
            }
        }
            System.out.println("number of values over 50: "+ over50);
    }
}
