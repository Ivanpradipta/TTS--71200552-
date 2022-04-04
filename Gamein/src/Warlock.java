
public class Warlock {
	
	private String weapon;
	Actor actor;
	Enemy enemy;
	public Warlock(String weapon) {
		// TODO Auto-generated constructor stub
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public void getInfo() {
		System.out.println("Name");
		System.out.println(enemy.getHealthPoint());
		System.out.println(weapon);
		System.out.println(actor.getX_pos());
		System.out.println(actor.getY_pos());
		System.out.println(enemy.getMoveSpeed());
	}
	public void attack() {
		int damage = weapon;
	}
	
	public void hitTaken() {
		
	}
}
