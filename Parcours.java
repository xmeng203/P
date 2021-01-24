
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Parcours {
	ArrayList<Point> list = new ArrayList<Point>();
	int position=0;
	public static final int avancer = 1;

	public Parcours() {
		Point p1=new Point();
		p1.x=Affichage.X+(Affichage.LARGEUR*1/2);
		p1.y=Affichage.HAUT-(Affichage.HAUTEUR*1/2);
		list.add(p1);
		Random rand=new Random();
		for(int i=2;i<=7;i++) {
			Point p=new Point();
			int r=rand.nextInt(100)+(100*(i-1));
			p.x=r;
			p.y=rand.nextInt(399)+1;
			list.add(p);		
		}
		
		
		
	}
	
	public ArrayList<Point> ajouter(ArrayList<Point> points) {
		
		Point p=new Point();
		Random rand=new Random();
		p=points.get(points.size()-1);
		System.out.printf("px%d",p.x);
		if(p.x<=Affichage.LARG) {
		//	System.out.printf("entre");
			Point p1=new Point();
			int r=rand.nextInt(100)+(601);
			p1.x=r;
			p1.y=rand.nextInt(399)+1;
			//System.out.printf("x%d,y%d\n",p1.x,p1.y);
			points.add(p1);			
		}	
		
		return remove(points);
	}
	
	public ArrayList<Point> remove(ArrayList<Point> points) {
		
		Point p=new Point();
		p=points.get(1);
		if(p.x<0) {
			points.remove(0);	
			System.out.printf("remove\n");
		}	
		return points;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition() {
		this.position = position+avancer;
	}
	
	}
	
