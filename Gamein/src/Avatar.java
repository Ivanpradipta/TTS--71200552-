
public abstract class Avatar implements IMoveable, IKeyInput  {
	
	private String name;
	private int healthPoint;
	private float moveSpeed;
	private String weapon;
	
	public void hitTaken(int x) {
		
	}
	
	public void attack(Warlock w) {
		
		
	}
	@Override
	public void move(float x, float y) {
		System.out.println("move");
	}
	
	@Override
	public void jump(float jump) {
		System.out.println("jump");
	}
	
	
	
	
	
}
