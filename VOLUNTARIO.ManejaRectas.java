public class ManejaRectas {
	public static void main(String[] args) {
		Vector vectorA;
		Vector vectorB;
		Punto puntoA1;
		Punto puntoA2;
		Punto puntoB1;
		Punto puntoB2;
		puntoA1 =new Punto(1,2,3);
		puntoA2 =new Punto(9,10,14);
		puntoB1 =new Punto(19,2,0);
		puntoB2 =new Punto(3,90,10);
		vectorA =new Vector(puntoA1,puntoA2);
		vectorB =new Vector(puntoB1,puntoB2);
		float relacionX;
		float relacionY;
		float relacionZ;
		float perteneceX;
		float perteneceY;
		float perteneceZ;
		float PCx;
		float PCy;
		float PCz;
		relacionX =(vectorA.getVx())/(vectorB.getVx());
		relacionY =(vectorA.getVy())/(vectorB.getVy());
		relacionZ =(vectorA.getVz())/(vectorB.getVz());
		if(relacionX==relacionY) {
			if (relacionY==relacionZ) {
				perteneceX=(puntoA1.getX()-puntoB1.getX())/vectorB.getVx();
				perteneceY=(puntoA1.getY()-puntoB1.getY())/vectorB.getVy();
				perteneceZ=(puntoA1.getZ()-puntoB1.getZ())/vectorB.getVz();
				if (perteneceX==perteneceY) {
					if (perteneceY==perteneceZ) {
						System.out.println("Las rectas son coincidentes");
					}
				}else {
					System.out.println("Las rectas son paralelas");
				}
			}else {
				System.out.println("Las rectas son secantes");
				PCx=((-vectorA.getVx()*puntoB1.getX())+(vectorB.getVx()*puntoA1.getX()))/(vectorB.getVx()-vectorA.getVx());
				PCy=((-vectorA.getVy()*puntoB1.getY())+(vectorB.getVy()*puntoA1.getY()))/(vectorB.getVy()-vectorA.getVy());
				PCz=((-vectorA.getVz()*puntoB1.getZ())+(vectorB.getVz()*puntoA1.getZ()))/(vectorB.getVz()-vectorA.getVz());
				System.out.println("Se cortan en el punto x="+PCx+" y= "+PCy+" y z="+PCz);
			}
		}	
	} 
	}
