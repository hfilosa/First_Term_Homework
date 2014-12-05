public class sort extends superArray <Integer>{
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
}
