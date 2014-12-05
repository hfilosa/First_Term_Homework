public class sort extends superArray <Integer>{
    //Finds correct position for first item, then second, etc.
    public void isort(){
	for (int n=0;n<size();n++){
	    int i;
	    int newvalue = get(n);
	    for (i = n; i > 0 && newvalue<get(i-1) ; i--) {
		set(get(i-1),i);    
	    }
	    set(newvalue,i);
	}
    }
    //Finds correct value for first position, then second, etc.
    public void ssort(){
	int min;
	int index;
	for (int i=0;i<size()-1;i++){
	    min=get(i);
	    index=i;
	    for (int n=i;n<size();n++){
		if (get(n)<min){
		    min=get(n);
		    index=n;
		}
	    }
	    set(get(i),index);
	    set(min,i);
	}
    }
    //Loops through array, swapping items w/ their neighbors, until it is sorted
    public void bsort(){
	int value;
	boolean sorted = false;
	while (!sorted){
	    sorted=true;
	    for (int n=0;n<size()-1;n++){
		if (get(n)>get(n+1)){
		    value=get(n);
		    set(get(n+1),n);
		    set(value,n+1);
		    sorted=false;
		}
	    }
	}
    }

}
