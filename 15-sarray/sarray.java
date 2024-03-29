public class sarray {
    private int[] data;
    private int lastindex = -1;

    public sarray(){
	data = new int[10];
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
	int[] ans = new int[data.length+1];
	for (int i=0;i<size();i++){
	    ans[i]=data[i];
	}
	data = ans;
    }

    //adds value to end of list
    public boolean add(int i){
	if (size()<data.length){
	    data[lastindex+1]=i;
	    lastindex+=1;
	}
	else {
	    expand();
	    data[data.length-1]=i;
	    lastindex+=1;
	}
	return true;
    }

    //adds value at specific index and shift rest down
    public void add(int val,int index){
	if (size()<data.length){
	    for(int i=lastindex;i>=index;i--){
		data[i+1]=data[i];
	    }
	    data[index]=val;
	    lastindex+=1;
	}
	else{
	    expand();
	    add(val,index);
	}
    }

    //retrieves value from specific index
    public int get(int index){
	return data[index];
    }

    //Set value at an index to specificed value
    public int set(int val, int index){
	int ans = data[index];
	data[index]=val;
	return ans;
    }

    //returns length of list. How many elements in list
    public int size(){
	return lastindex+1;
    }

    //Remove value from index and shift values over
    public int remove(int index){
	int ans = data[index];
	for (int i=index;i<lastindex;i++){
	    data[i]=data[i+1];
	}
	data[lastindex]=0;
	lastindex=lastindex-1;
	return ans;
    }
}
