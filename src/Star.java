public class Star {

    public String color;
    public int points;

    public Star(){
        color = "pink";
        points = 7;
    }

    public void printInfo(){
        System.out.println("color:" + color + "\nNumber of points:" + points);
    }
}
