public class sort extends superArray <Integer>{
    //Finds correct position for first item, then second, etc.
    public String isort(){
	int comp=0,as=0;//comp = comparisons,as = assignments
	for (int n=0;n<size();n++){
	    int i;
	    int newvalue = get(n);
	    for (i = n; i > 0 && newvalue<get(i-1) ; i--) {
		set(get(i-1),i);
		comp+=2;
		as+=2;
	    }
	    set(newvalue,i);
	    as+=2;
	}
	return "Comparisons: "+comp+"\n Assignments: "+as;
    }
    //Finds correct value for first position, then second, etc.
    public String ssort(){
	int min;
	int index;
	int comp=0,as=0;//comp = comparisons,as = assignments
	for (int i=0;i<size()-1;i++){
	    min=get(i);
	    index=i;
	    for (int n=i;n<size();n++){
		if (get(n)<min){
		    min=get(n);
		    index=n;
		    as+=2;
		}
		comp+=2;
	    }
	    set(get(i),index);
	    set(min,i);
	    as+=5;
	}
	return "Comparisons: "+comp+"\n Assignments: "+as;
    }
    //Loops through array, swapping items w/ their neighbors, until it is sorted
    public String bsort(){
	int value;
	boolean sorted = false;
	int comp=0,as=0;//comp = comparisons,as = assignments
	while (!sorted){
	    sorted=true;
	    for (int n=0;n<size()-1;n++){
		if (get(n)>get(n+1)){
		    value=get(n);
		    set(get(n+1),n);
		    set(value,n+1);
		    sorted=false;
		    as+=4;
		}
		comp+=2;
	    }
	    comp+=1;
	    as+=1;
	}
	return "Comparisons: "+comp+"\n Assignments: "+as;
    }
}

/* Insertion sort had the most total assigments and comparisons. It assigned slightly more than it compared. Selection sort had the most comparisons, but very few assignments. Bubble sort had more assignments than selection sort, but less comparisons. */
