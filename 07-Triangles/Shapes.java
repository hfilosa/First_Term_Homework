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
    //tri3u prints an upside-down iwsosecles triangle
    public String tri3u(int h){
	String ans="";
	int row=0;
	while(row<h){
	    int base=((h*2)-1)-2*(row);
	    int space=row;
	    while(space>=0){
		ans+=" ";
		space-=1;
	    }
	    while (base>0){
		ans+="*";
		base-=1;
	    }
	    ans+="\n";
	    row+=1;
	}
	return ans;
    }
    public String tri3(int h){
	String ans="";
	int row=0;
	while(row<h){
	    int star=2*(row)+1;
	    int space=h-row-1;
	    while(space>=0){
		ans+=" ";
		space-=1;
	    }
	    while (star>0){
		ans+="*";
		star-=1;
	    }
	    ans+="\n";
	    row+=1;
	}
	return ans;
    }
    public String diamond(int h){
	String ans="";
	ans+=tri3(h/2);
	for (int x=0;x<h;x+=1){
	    ans+="*";
	}
	ans+="\n";
	ans+=tri3u(h/2);
	return ans;
    }
    public String tri4(int h){
	String ans="";
	for (int row=0;row<h;row++){
	    for (int space=row;space>0;space-=1){
		ans+=" ";
	    }
	    for (int star=h-row;star>0;star-=1){
		ans+="*";
	    }
	    ans+="\n";
	}
	return ans;
    }

}
