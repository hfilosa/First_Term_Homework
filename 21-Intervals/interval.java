import java.util.Random;

public class interval{
    private int low,high;
    private static Random rand = new Random();

    public interval(int l, int h){
	low = l;
	high = h;
    }
    public interval(){
        low = rand.nextInt(100);
	high = rand.nextInt(100)+1+low;
    }

    public String toString(){
	return "["+low+","+high+"]";
    }
    public int compareTo(interval other){
	if (this.low == other.low){
	    return this.high - other.high;
	}
	else{
	    return this.low - other.low;
	}
    }
}
