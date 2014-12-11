public class search{
    //Search array for object with that identifier and return entire object
    public Comparable lsearch(Comparable[] a,Comparable val){
	for (int i=0;i<a.length;i++){
	    if (a[i].compareTo(val)==0){
		return a[i];
	    }
	}
	return -1;
    }
    public Comparable bsearch(Comparable[] a,Comparable val;){
	int mid = (a.length)/2
boolean 
