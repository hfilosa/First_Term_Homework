import java.util.Arrays;
public abstract class basechar implements Comparable {
    private int health;
    private int strength;
    private int defense;
    private int speed;
    private int mana;      
    private boolean defending;
    //  private int attackStrength;
    private String name;

    
    public String toString(){
	return name;
    }


    /*   public void setAttackStrength (int s){
=======
    public void assignDamage(basechar other)
    {
	int AT = other.getAttackStrength();
	other.lowerHealth(AT);


    }
	    
    

    public int getAttackStrength () {
	return attackStrength;
    }
    public void setAttackStrength (int s){
>>>>>>> f2f2712443505c10d5f03b9dff3718099148bdac
	attackStrength = s;
    }
    public void lowerAttackStrength (int l){
    attackStrength = attackStrength - l;
    }*/
    public void setDefending (boolean b){
	defending = b;
    }
    public boolean getDefending () {
	return defending;
    }

    public void setSpeed (int s){
	speed = s;
    }
    public int getSpeed (){
	return speed;
    }
	
    public void setHealth(int h){
	health=h;
    }
    public int getHealth(){
	return health;
    }
    public void lowerHealth(int l){
	health = health - l;
	if (health < 0){
	    health = 0;
	    }
    }
    public void increaseHealth(int i){
	health = health + i;
    }
    public void setStrength(int s){
	strength=s;
    }
    public int getStrength(){
	return strength;
    }
    public void setMana(int s){
	mana=s;
    }
    public int getMana(){
	return mana;
    }
    public void setName(String n){
	name = n;
    }
    public String getName(){
	return name;
    }
    
    public int compareTo(Object other){
	basechar o = (basechar) other;
	return this.getName().compareTo(o.getName());
    }

    public void pause(int t){
	try {
	    Thread.sleep(t);
	} catch (Exception e) {}
    }
    public static void main(String[] args){
	warrior[] data = new warrior[3];
	data[1] = new warrior("Adam");
	data[2] = new warrior("Bob");
	data[0] = new warrior("Liam");
	System.out.println(Arrays.toString(data));
	Arrays.sort(data);
	System.out.println(Arrays.toString(data));
    }
}
