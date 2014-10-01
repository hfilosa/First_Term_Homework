public class Shapes {
    public String box(int r, int c) {
	String ans = "";
	int x = 0;
	int y = 0;
	String row = "";
	while(y<c){
	    row+="*";
	    y+=1;
	}
	row+="\n";
	while (x<r){
	    ans+=row;
	    x+=1;

	}
	return ans;
    }
    public String tri1(int h){
	String ans="";
	while (h>0) {
	    int x = h;
	    while(x>0){
		ans="*"+ans;
		x-=1;
	    }
	    h-=1;
	    ans="\n"+ans;
	}
	return ans;
    }
    public String tri2(int h){
	String ans="";
	int base=h;
	while (h>0) {
	    int space = h-1;
	    int stars = base-space;
	    while (space>0){
		ans+=" ";
		space-=1;
	    }
	    while (stars>0){
		ans+="*";
		stars-=1;
	    }
	    ans+="\n";
	    h-=1;
	}
	return ans;
    }


}
