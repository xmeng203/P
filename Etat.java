import java.awt.Point;
import java.util.ArrayList;

public class Etat {
	
	/* Constantes */
	public static final int SAUT = 50;/** La hauteur de chaque mouvement ascendant */
	public static final int SAUTBAS = 50;/** La hauteur de chaque mouvement vers le bas */
	
	private int height;
	public Parcours parcours;
	//private int position;
	
	//public Affichage affichage= new Affichage(etat);
	/** Constructeur 
	 * @param parcours 
	 * @param  */
	public Etat(Parcours parcours) {
		this.height=Affichage.HAUT-(1/2*Affichage.HAUTEUR)-Affichage.Y;
		this.parcours=parcours;
		//this.position=parcours.position;
		
	}

	public int getHeight() {
	        return height;
	}
	
	
	public ArrayList<Point> getParcours() {
		//System.out.printf("getParcours\n");
		ArrayList<Point> points=parcours.list;
		int pos=parcours.position;
		for(int i=0;i<points.size();i++) {
			Point p=points.get(i);
			//System.out.printf("get%d \n",p.x);
			int x=p.x-pos;
			p.x=x;			
			System.out.printf("getParcours%d \n",pos);
		}
		
		return parcours.ajouter(points);
	}
	 
	/** Etat */
	public void jump() {	
		
		if(height+1/2*Affichage.HAUTEUR+SAUT>Affichage.HAUT) {
			System.out.printf("Vous ne pouvez pas le sauter.\n");
		}
		else {
			height=height+SAUT;
		}
	}
	
	/** Etat */
	public void MoveDown() {
		//System.out.printf("heightdown:%d\n",height);
		if(height-SAUTBAS<Affichage.HAUTEUR) {	
			//System.out.printf("Vous ne pouvez pas le sauter.\n");
		}
		else {
			height=height-SAUTBAS;
			
		}
	}

	public int getPosition() {
		// TODO Auto-generated method stub
		return parcours.getPosition();
	}

	public void setPosition() {
		// TODO Auto-generated method stub
		parcours.setPosition();
	}
	
}
