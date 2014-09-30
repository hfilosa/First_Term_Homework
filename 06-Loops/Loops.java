public class Loops {
    public String frontTimes(String str, int n) {
	int x = 0;
	String ans = "";
	String front = "";
	if (str.length() > 3) {
	  front = str.substring(0,3);}
	else {
	  front = str.substring(0);}
	while (x<n) {
	    ans = ans + front;
	    x+=1;}
	return ans;
    }
    public String stringBits(String str) {
	String ans = "";
	int x = 0;
	while (x<str.length()){
	    ans += str.charAt(x);
	    x+=2;}
	return ans;
    }
    public String stringYak(String str) {
	String ans = "";
	int x = 0;
	while (x < str.length()){
	    if (x+2 < str.length() && str.charAt(x) == 'y' && str.charAt(x+2) == 'k'){
		x+=3;}
	    else{
		ans+=str.charAt(x);
		x+=1;}
	}
	return ans;
    }
    public int stringMatch(String a, String b) {
	int ans = 0;
	int x = 0;
	while ((x < a.length()-1) && (x < b.length()-1)){
	    if (a.charAt(x) == b.charAt(x) && a.charAt(x+1) == b.charAt(x+1)){
		ans+=1;}
	    x+=1;
	}
	return ans;
    }
}
