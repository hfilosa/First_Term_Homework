import java.util.*;

public class Driver{
    public static void main(String args[]){
	interval[] a = new interval[10];
	for (int i=0;i<a.length;i++){
	    a[i]=new interval();
	    System.out.println(a[i]);
	}
	System.out.println(a[0].compareTo(a[1]));
    }
}
