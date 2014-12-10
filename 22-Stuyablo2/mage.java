import java.util.Random;
public class mage extends basechar implements Comparable
{
    Random randomNumber = new Random();
    public int compareTo(Object other){
	mage o = (mage)other;
	return this.name.compareTo(o.name);
    }
    public mage(String n) 
    {     
	setStrength(40 + randomNumber.nextInt(20));
	setHealth(90 + randomNumber.nextInt(20));
	setSpeed(40 + randomNumber.nextInt(20));
	setMana(90 + randomNumber.nextInt(20));
	setName(n);
    }
    public void firespell(basechar other) 
    {
	this.setAttackStrength(this.getMana()/10 + randomNumber.nextInt(20)); 
	System.out.println(this.getName()+" shoots FIRE at "+other.getName());
	other.setDefending(true);
    }
    public void heal(basechar other)
    {
	System.out.println(this.getName() + " is HEALING");
	other.assignDamage(this);
	    if (this.getHealth() == 0)
		{
		    System.out.println(this.getName() + " was killed while HEALING");
		}
	    this.increaseHealth(this.getMana()/3 + randomNumber.nextInt(20));
    }
}
			   

