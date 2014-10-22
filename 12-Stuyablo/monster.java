import java.util.*;
import java.io.*;

public class monster extends basechar { 
    
    Random r = new Random();
    public void monster() { 
	setHealth(160+r.nextInt(20));
	setStrength(90+r.nextInt(20));
	setSpeed(60+r.nextInt(20));
	setManna(60 + r.nextInt(20));
	setName("Generic Orc");
	System.out.println("I am an orc");
    }
   
   public void monster(String n) { 
	setHealth(160+r.nextInt(20));
	setStrength(90+r.nextInt(20));
	setSpeed(60+r.nextInt(20));
	setManna(60 + r.nextInt(20));
	setName(n);
	System.out.println("I am an "+n);
    }
	
    public void evilAttack(basechar other) {
	int damage = this.getStrength() - other.getDefense();
	other.setHealth(other.getHealth() - damage);
	System.out.println(this + "evilAtacked"+other);
	System.out.println(other +"lost"+damage+"damage!!");
    } 
    public void darkMagic(basechar other) {

	
	int damage = this.getManna() - other.getDefense();
	this.setManna(this.getManna() / 2);
	if (r.nextInt(2)==1) {
	other.setHealth(other.getHealth() - damage);
	System.out.println(this + "used DARKMAGIC on"+other);
	System.out.println(other +"lost"+damage+"damage!!");
	    }
	else {
	    System.out.println("DARK MAGIC missed and manna was wasted");
	}
    }
    public void protect(basechar other) {
	this.setDefending(True);
	this.setDefense(this.getDefense + 5);
    }
    public void deathSequence(basechar other) {
        System.out.println("i have died");
    }
	
	
}
