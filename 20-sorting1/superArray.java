public class superArray <T extends Comparable<T>> {
    private T[] data;
    private int lastindex = -1;

    public superArray(){
	@SuppressWarnings("unchecked")
	Object[] temp = new Object[10];
	data = (T[])temp;
    }

    //Displays contents of data. Stops at end of list, not end of data
    public String toString(){
	String ans = "";
	for (int i=0;i<size();i++){
	    ans+=data[i]+",";
	}
	return ans;
    }

    //Copies items in data over to new list with one more memory slot
    public void expand(){
	@SuppressWarnings("unchecked")
	T[] ans = (T[])new Object[data.length+1];
	for (int i=0;i<size();i++){
	    ans[i]=data[i];
	}
	data = ans;
    }

    //adds value to end of list
    public boolean add(T value){
	if (size()<data.length){
	    data[lastindex+1]=value;
	    lastindex+=1;
	}
	else {
	    expand();
	    data[data.length-1]=value;
	    lastindex+=1;
	}
	return true;
    }

    //adds value at specific index and shift rest down
    public void add(T value,int index){
	if (size()<data.length){
	    for(int i=lastindex;i>=index;i--){
		data[i+1]=data[i];
	    }
	    data[index]=value;
	    lastindex+=1;
	}
	else{
	    expand();
	    add(value,index);
	}
    }

    //retrieves value from specific index
    public T get(int index){
	return data[index];
    }

    //Set value at an index to specificed value
    public T set(T value, int index){
	T ans = data[index];
	data[index]=value;
	return ans;
    }

    //returns length of list. How many elements in list
    public int size(){
	return lastindex+1;
    }

    //Remove value from index and shift values over
    public T remove(int index){
	T ans = data[index];
	for (int i=index;i<lastindex;i++){
	    data[i]=data[i+1];
	}
	data[lastindex]=null;
	lastindex=lastindex-1;
	return ans;
    }

    public void isort(){
	for (int n=0;n<size();n++){
	    int i;
	    T newvalue = data[n];
	    for (i = n; i > 0 && newvalue.compareTo(data[i-1])<0 ; i--) {
		data[i] = data[i-1];    
	    }
	    data[i]=newvalue;
	}
    }
}
