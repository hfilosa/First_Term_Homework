public class Driver {
    public static void main (String[] args){

	public boolean mixStart(String str); {
	    if (str.length() > 3) {
		return str.substring(1,3).equals("ix");
	    }
	    else {
		return false;
	    }
	}
	
	public String makeOutWord(String out, String word) {
	    return out.substring(0,2)+word+out.substring(2,4);
	}
   
	public String firstHalf(String str) {
	    return str.substring(0,(str.length()/2));
	}
 
    }
}
