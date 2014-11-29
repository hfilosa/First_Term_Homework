public class orderedSuperArray extends superArray<String>{
    //Adds a word into the array at its proper alphabetical location 
    public boolean add(String word){
	if (size()==0){
	    super.add(word);
	}
	else if (word.compareTo(get(size()-1))>=0){
	    add(word,size());
	}
	else{
	    for (int i=0;i<size();i++){
		if (word.compareTo(get(i))<=0){
		    add(word,i);
		    break;
		}
	    }
	}
	return true;
    }
    /*Replaces the value at the specified location and moves it to its
proper alphabetical location. This is equivalent to removing the value
at the specified index and then readding it. That is what this 
method really does. */
    public String set (String value, int index){
	remove(index);
	this.add(value);
	return "";
    }
}
