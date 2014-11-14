import java.util.*;

public class Driver{

    //A function to print the arrays
    public String print(int[] a){
	String ans = "";
	for (int i=0;i<a.length;i++){
	    ans+=a[i]+",";
	}
	return ans;
    }

    public static void main(String args[]){

	//Creates an arrayList of values 0-99999
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<100000;i++){
	    al.add(i);
	}

	//	System.out.println("ArrayList Before Randomization: "+al);

	//new arraylist to randomly place values into 
	ArrayList<Integer> newAl = new ArrayList<Integer>();

	//Randomly selects from original list and add to new list
	for(int i=0;i<al.size();i=i){
	    int val = al.remove(r.nextInt(al.size()));
	    newAl.add(val);
	}
	al=newAl;

	//	System.out.println("ArrayList After Ramdomization: "+al);	

	int[] a = new int[100000];
	for(int i=0;i<a.length;i++){
	    a[i]=i;
	}
	
	int firstindex = 0;
	int secondindex = 0;
	int firstval = 0;

	for (int i=0;i<a.length*10;i++){
	    firstindex=r.nextInt(100000);
	    secondindex=r.nextInt(100000);
	    firstval=a[firstindex];
	    a[firstindex]=a[secondindex];
	    a[secondindex]=firstval;
	}
	

    }
}

