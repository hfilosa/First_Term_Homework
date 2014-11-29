import java.util.*;

public class Driver{
    public static void main(String[] args){
	//First testing with integers
	superArray<Integer> m = new superArray<Integer>();
	for (int i=1;i<10;i++){
	    m.add(i);
	}
	System.out.println(m);
	m.add(10);
	System.out.println(m);
      	m.set(33,2);
	System.out.println(m);
       	m.add(-1,5);
	System.out.println(m);
       	m.remove(5);
	System.out.println(m);
	System.out.println(m.get(4));
	//Now testing with Strings
	superArray<String> test = new superArray<String>();
	test.add("bear");
	test.add("coyote");
	test.add("Elk");
	System.out.println(test);
	test.remove(1);
	System.out.println(test);
    }
}
