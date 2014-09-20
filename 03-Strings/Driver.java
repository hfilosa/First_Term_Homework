public class Driver {
    public static void main (String[] args) {
	String s="henry filosa";
	int spaceIndex = s.indexOf(" ");
	System.out.println("The space character's index is: " + spaceIndex);
	String[] part = s.split(" ");
	System.out.println("The first half of the string is: "+ part[0]);
	System.out.println("The second half of the string is: "+ part[1]);
    }
}
