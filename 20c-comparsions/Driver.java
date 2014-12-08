import java.util.*;

public class Driver{
    public static void main(String args[]){
	Random r = new Random();
	sort m = new sort();
	int arrayLength = 0;
	if(args.length>0){
	    arrayLength = Integer.parseInt(args[0]);
	}
	else{
	    System.out.println("First input must specify length of random array");
	}
	for (int i=0;i<arrayLength;i++){
	    m.add(r.nextInt(10));
	}
	if (args.length>1){
	    if (args[1].equals("i")){
		System.out.println(m.isort());
	    }
	    else if (args[1].equals("s")){
		System.out.println(m.ssort());
	    }
	    else if (args[1].equals("b")){
		System.out.println(m.bsort());
	    }
	    else{
		System.out.println("Incorrect second input given, put no inputs for example run");
		System.out.println("Acceptable second inputs");
		System.out.println("i ==> Insertion sort");
		System.out.println("s ==> Selection sort");
		System.out.println("b ==> Bubble sort");
	    }
	}
	else{System.out.println("Error: no algorithm specified");
		System.out.println("Acceptable algorithms");
		System.out.println("i ==> Insertion sort");
		System.out.println("s ==> Selection sort");
		System.out.println("b ==> Bubble sort");
	}
    }
}
