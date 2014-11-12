import java.util.*

public class arrayList.java{

    public static void main(String args[]){

	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<20;i++){
	    al.add(r.nextInt(5));
	}

