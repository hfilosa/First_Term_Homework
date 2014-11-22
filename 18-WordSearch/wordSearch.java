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
	if(r>board.length-1 || r<0){
	    return false;
	}
	if(c>board[r].length-1 || c<0){
	    return false;
	}
	return board[r][c] == '*' || board[r][c]==a;
    }

    public boolean addWord(String word){
	Random r = new Random();
	int xinc = 0;
	int yinc = 0;
	int startr = 0;
	int startc = 0;
	while (xinc==0 && yinc==0){
	    xinc = r.nextInt(3)-1;
	    yinc = r.nextInt(3)-1;
	}
	boolean test = false;
	int tries = 1000;
	while(!test && tries>0){
	    startr = r.nextInt(board.length);
	    startc = r.nextInt(board[startr].length);
	    int tempr = startr;
	    int tempc = startc;
	    for (int i=0;i<word.length();i++){
		test=check(tempr,tempc,word.charAt(i));
		if (!test){
		    break;
		}
		tempr += xinc;
		tempc += yinc;
	    }
	    tries-=1;
	}
	if (tries == 0){
	    return false;
	}
	for (int i=0;i<word.length();i++){
	    board[startr+i*xinc][startc+i*yinc]=word.charAt(i);
	}
	return true;
    }

    public void addAll(){
	for (int i=0;i<wordBank.length;i++){
	    addWord(wordBank[i]);
	}
    }

    public void fillGaps(){
	Random rand = new Random();
	for (int r=0;r<board.length;r++){
	    for (int c=0;c<board[r].length;c++){
		if (board[r][c] == '*'){
		    board[r][c] = (char)(rand.nextInt(26)+'A');
		}
	    }
	}
    }

    public static void main(String[] args){
	wordSearch w = new wordSearch();
	System.out.println("Before adding the words");
	System.out.println(w);
	w.addAll();
	System.out.println("After adding the words:");
	System.out.println(w);
	w.fillGaps();
	System.out.println("Finished puzzle with gaps filled by random characters");
	System.out.println(w);
    }
}
