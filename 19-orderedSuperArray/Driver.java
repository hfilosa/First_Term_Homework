public class Driver{
    public static void main(String[] args){
	orderedSuperArray m = new orderedSuperArray();
	m.add("Book");
	System.out.println(m);
	m.add("Library");
	System.out.println(m);
	m.add("Apple");
	System.out.println(m);
	m.add("Crocodile");
	System.out.println(m);
	m.add("Zebra");
	System.out.println(m);
	m.set("Garbage",0);
	System.out.println(m);
    }
}
