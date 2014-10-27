import java.util.*;

public class arrayStuff {
    private int[] array;

    public void randArray100(){
	array = new int[100];
	Random rand = new Random();
	for (int i=0;i<100;i++){
	    array[i]=75+rand.nextInt(76);
	}
    }

    public arrayStuff() {
	this.randArray100();
	    }

    public String toString(){
	String s="";
	for (int i=0;i<array.length;i++){
	    s+=array[i]+",";
	}
	return s;
    }

    public int find(int value){
	for (int i=0;i<array.length;i++){
	    if (array[i]==value){
		return i;
	    }
	}
	return -1;
    }
    public int maxValue(){
	int max;
	max=array[0];
	for (int i=1;i<array.length;i++){
	    if (array[i]>max){
		max=array[i];
	    }
	}
	return max;
    }
}

     
