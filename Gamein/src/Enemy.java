
public abstract class Enemy {
	
	private boolean IsBoss;
	private int healthPoint;
	private float moveSpeed;
	
	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void attack();
	abstract void hitTaken();

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public float getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(float moveSpeed) {
		this.moveSpeed = moveSpeed;
	}
	
	
	
}
