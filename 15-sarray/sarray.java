public class sarray {
    private int[] data;
    private int lastindex = -1;

    public sarray(){
	data = new int[1];
    }

    public String toString(){
	String ans = "";
	for (int i=0;i<size();i++){
	    ans+=data[i]+"\n";
	}
	return ans;
    }

    public void expand(int[] a){
	int[] ans = new int[a.length+1];
	for (int i=0;i<a.length;i++){
	    ans[i]=a[i];
	}
    }

    //adds value to end of list
    public void add(int i){
	if (size()<data.length){
	    data[size()]=i;}
	else {
	    expand(data);
	    data[data.length-1]=i;
	}
    }

    //adds value at specific index and shift rest down
    public void add(int val,int index){

    }

    //retrieves value from specific index
    public void get(int index){
    }

    //Set value at an index to specificed value
    public void set(int val, int index){
    }

    //returns length of list. How many elements in list
    public int size(){
	return lastindex+1;
    }

    //Remove value from index and shift values over
    public void remove(int index){
    }
}
