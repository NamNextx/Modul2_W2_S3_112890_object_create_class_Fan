public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(){

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        if (this.getOn()){
            return getSpeed()+" "+getRadius()+" "+getColor()+" Fan is on";
        }
        else return "Fan is off";
    }
}
class Main{
    public static void main(String[] args) {
        Fan Fan1=new Fan();
        Fan1.setSpeed(3);
        Fan1.setRadius(10);
        Fan1.setColor("Yellow");
        Fan1.setOn(true);

        System.out.println(Fan1.toString());
        Fan Fan2=new Fan();
        Fan2.setSpeed(2);
        Fan2.setRadius(5);
        Fan2.setColor("Blue");
        Fan2.setOn(false);
        System.out.println(Fan2.toString());
    }
}
