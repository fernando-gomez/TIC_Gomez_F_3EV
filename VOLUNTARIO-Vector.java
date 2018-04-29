public class Vector {
	private Punto p1;
	private Punto p2;
	private int vx=(int) (p1.getX()-p2.getX());
	private int vy=(int) (p1.getY()-p2.getY());
	private int vz=(int) (p1.getZ()-p2.getZ());
	public Vector(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	public Punto getP1() {
		return p1;
	}
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	public Punto getP2() {
		return p2;
	}
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	public int getVx() {
		return vx;
	}
	public void setVx(int vx) {
		this.vx = vx;
	}
	public int getVy() {
		return vy;
	}
	public void setVy(int vy) {
		this.vy = vy;
	}
	public int getVz() {
		return vz;
	}
	public void setVz(int vz) {
		this.vz = vz;
	}
	
}
