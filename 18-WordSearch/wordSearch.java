import java.util.*;

public class wordSearch{
    
    private char[][] board;

    String[] wordBank = {"DOG","CAT","FROG","HORSE","MOUSE","BAT","RABBIT","GIRAFFE","WHALE"};

    public wordSearch(int row,int col){
	board = new char[row][col];
	for (int r=0;r<board.length;r++){
	    for (int c=0;c<board[r].length;c++){
		board[r][c]='*';
	    }
	}
    }

    public wordSearch(){
	this(20,30);
    }

    public String toString(){
	String ans = "";
	for (int r=0;r<board.length;r++){
	    for (int c=0;c<board[r].length;c++){
		ans+=board[r][c];
		}
	    ans+="\n";
	}
	return ans;
    }

    public boolean check(int r,int c,char a){
	if(r>board.length || c>board[r].length){
	    return false;
	}
	return board[r][c] == '*'|| board[r][c]==a;
    }

    public void add(String word){
	Random r = new Random();
	int xinc = 0;
	int yinc = 0;
	while (xinc==0 && yinc==0){
	    int xinc = r.nextInt(3)-1;
	    int yinc = r.nextInt(3)-1;
	}
	boolean test= false;
	while(!test){
	    int startr = r.nextInt(board.length);
	    int startc = r.nextInt(board[0].length);
	    int tempr = startr;
	    int tempc = startc;
	    for (int i=0;i<word.length();i++){
		test=check(tempr,tempc,word.getchar(i));
		if (!test){
		    break;
		}
		tempr += xinc;
		tempc += yinc;
	    }
	}
	for (int i=0;i<word.length();i++){
	    board[startr+i*xinc][startc+i*yinc]=word.getchar(i);
	}
    }





    public static void main(String[] args){
	wordSearch w = new wordSearch();
	System.out.println(w);
	w.add("Horse");
	System.out.println(w);
    }
}
