public class Frames {
    public String Frame(int r, int c){
	String ans = "";
	String top="";
	for (int x=0;x<c;x++){
	    top+="*";
	}
	top+="\n";
	for (int x=0;x<r-2;x++){
	    ans+="*";
	    for (int y=0;y<c-2;y++){
		ans+=" ";
	    }
	    ans+="*\n";
	}
	return top+ans+top;
    }
    public String stringSplosion(String str) {
	int len = str.length();
	String ans = "";
	while (len>0) {
	    ans= str.substring(0,len) + ans;
	    len-=1;
	}
	return ans;
    }
    public String stringX(String str) {
	String ans = "";
	int len = str.length();
	for (int x=0;x<len;x++){
	    if ((x==0 || x==len-1)||(str.charAt(x) != 'x')){
		ans+=str.charAt(x);
	    }
	}
	return ans;
}

}
