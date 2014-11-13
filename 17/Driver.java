import java.util.*;

public class Driver{

    public String print(){
	String ans = "";
	return ans;
    }

    public static void main(String args[]){

	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<100000;i++){
	    al.add(i);
	}

	ArrayList<Integer> newAl = new ArrayList<Integer>();

	for(int i=0;i<al.size();i++){
	    newAl.add(al.remove(r.nextInt(al.size())));
	}


	/*
	int[] a = new int[20];
	for(int i=0;i<a.length;i++){
	    a[i]=i;
	}
	
	int firstindex = 0;
	int secondindex = 0;
	int firstval = 0;

	//		System.out.println("Array Before Randomization: "+a);
	for (int i=0;i<a.length*10;i++){
	    firstindex=r.nextInt(20);
	    secondindex=r.nextInt(20);
	    firstval=a[firstindex];
	    a[firstindex]=a[secondindex];
	    a[secondindex]=firstval;
	}

	//	System.out.println("Array After Ramdomization: "+a);
	*/

    }
}

