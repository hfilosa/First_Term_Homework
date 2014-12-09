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
    public int getLow(){
	return low;
    }
    public int getHigh(){
	return high;
    }
    public int compareTo(interval other){
	return this.getLow()-other.getLow();
    }
}
