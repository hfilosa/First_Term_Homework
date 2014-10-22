<<<<<<< HEAD
public class mage extends basechar {
    public mage(String n) {
	setName(n);
	setStrength(50);
	setHealth(100);
	setSpeed(75);
	setManna(20);
    }

    public int Crash(basechar other){
	int attackManna = this.getManna()/10 + Random.nextInt(20);
	System.out.println(this.name+" CRASHES "+other.name);
	other.setHealth(attackManna);
	if (attackManna > 25) {
	    System.out.println("The spell does CRITICAL DAMAGE");
	}
	if (attackManna < 15) {
	    System.out.println("The spell bounced off the enemy...");
	}
    }
} 
=======
import java.util.Random;
public class mage extends basechar 
{
    Random randomNumber = new Random();
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
			   
>>>>>>> f2f2712443505c10d5f03b9dff3718099148bdac
