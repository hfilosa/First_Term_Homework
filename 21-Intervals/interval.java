import java.util.Random;

public class interval{
    private int low,high;
    Random rand = new Random();
    public interval(){
        low = rand.nextInt(100);
	high = rand.nextInt(100)+1+low;
    }
    public String toString(){
	return "["+low+","+high+"]";
    }
}
