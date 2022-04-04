
public class Ninja {

	Weapon weapon;
	Enemy enemy;
	Actor actor;

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	@Override
	public void getInfo() {
		System.out.println("Name");
		System.out.println(enemy.getHealthPoint());
		System.out.println(weapon);
		System.out.println(actor.getX_pos());
		System.out.println(actor.getY_pos());
		System.out.println(enemy.getMoveSpeed());
	}
	public void Attack() {
		
	}
	

}
