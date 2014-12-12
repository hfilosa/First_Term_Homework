import java.util.*;

public class search{
    Comparable[] data;
    int size = 0;

    public search(int length){
	data = new Comparable[length];
    }

    public String toString(){
	return Arrays.toString(data);
    }

    public void additem(Comparable val){
	if (size<data.length){
	    data[size]=val;
	    size+=1;
	}
	else {
	    Comparable[] newdata = new Comparable[size+1];
	    for (int i=0;i<data.length;i++){
		newdata[i]=data[i];
	    }
	    data=newdata;
	    additem(val);
	}
    }

    public void sort(){
	Arrays.sort(data);
    }

    //Search array linearly for object with that identifier and return entire object
    public Comparable lsearch(Comparable val){
	for (int i=0;i<data.length;i++){
	    if (data[i].compareTo(val)==0){
		return data[i];
	    }
	}
	return null;
    }
    //Searches array for object in increasingly smaller halves of the array
    public Comparable bsearch(Comparable val){
	 int mid = (data.length)/2;
	 int oldmid = data.length;
	 boolean done = false;
	 while (!done){
	     if ((mid-oldmid)==0){
		 done=true;
	     }
	     else if (val.compareTo(data[mid])==0){
		 return data[mid];
	     }
	     else if (val.compareTo(data[mid])<0){
		 oldmid=mid;
		 mid=mid/2;
	     }
	     else if (val.compareTo(data[mid])>0){
		 mid=mid+Math.abs((oldmid-mid)/2);
	     }
	 }
	 return null;
     }
    //Recursive version of binary search
    public Comparable rbsearch(Comparable val){
	int mid=data.length/2;
	int oldmid=data.length;
	return rbsearch(val,mid,oldmid);
    }

    public Comparable rbsearch(Comparable val,int mid, int oldmid){
	if (val.compareTo(data[mid])==0){
	    return data[mid];
	}
	else if ((mid-oldmid)==0){
	    return null;
	}
	else if (val.compareTo(data[mid])<0){
	   return rbsearch(val,mid/2,mid);
	}
	else if (val.compareTo(data[mid])>0){
	    return rbsearch(val,(mid+Math.abs((oldmid-mid)/2)),oldmid);
	}
	return null;
    }


    public static void main(String[] args){
	search test = new search(10);
	for (int i=0;i<100;i++){
	    test.additem(i);
	}
       	System.out.println(test);
	test.sort();
       	System.out.println(test);
	//These tests show that the algorithms work for arrays up to size 100
	System.out.println("Starting test of Linear search");
	for (int i=0;i<100;i++){
	    System.out.println(test.lsearch(i));
	}
	System.out.println("Starting test of Binary search");
	for (int i=0;i<100;i++){
	    System.out.println(test.bsearch(i));
	}
	System.out.println("Starting test of Recursive Binary search");
	for (int i=0;i<100;i++){
	    System.out.println(test.rbsearch(i));
	}
    }
}
