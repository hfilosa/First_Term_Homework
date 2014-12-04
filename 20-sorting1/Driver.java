import java.util.*;

public class Driver{
    public static void main(String args[]){
	Random r = new Random();
	superArray m = new superArray();
	for (int i=0;i<10;i++){
	    m.add(r.nextInt(10));
	}
	System.out.println(m);
	m.isort();
	System.out.println(m);
    }
}
