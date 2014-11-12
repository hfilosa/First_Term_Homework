public class Driver{
    public static void main(String[] args){
	sarray m = new sarray();
	for (int i=1;i<10;i++){
	    m.add(i);}
	m.add(11);
	System.out.println(m);
	m.set(33,2);
	System.out.println(m);
	m.add(-1,5);
	System.out.println(m);
	m.remove(5);
	System.out.println(m);
	System.out.println(m.size());
	System.out.println(m.get(2));
    }
}
