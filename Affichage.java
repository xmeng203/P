
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class Affichage extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* Constantes */
	public static final int LARG = 600;/** La largeur de la fen¨ºtre */
    public static final int HAUT = 400;/** La hauteur de la fen¨ºtre */
    public static final int LARGEUR = 20;/** La largeur de l'ovale */
    public static final int HAUTEUR = 100;/** La hauteur de l'ovale */
    public static final int X = 50;/** La coordonn¨¦e X de l'ovale */
    public static final int Y = HAUT-HAUTEUR;/** La coordonn¨¦e Y de l'ovale */
    
    private int height = (1/2)*HAUTEUR;/** La distance entre le centre de l'ovale et le bas de la fen¨ºtre */
    private Etat etat;

 
    /** Constructeur 
     * @param parcours */
    public Affichage(Etat etat) {
            setPreferredSize(new Dimension(LARG, HAUT));
            this.etat=etat;
            new Thread(new Voler(etat,this)).start();
    		new Thread(new Avancer(etat,this)).start();
    }
    
    /** Affichage */
    @Override
    public void paint(Graphics g) { 
    	super.paint(g); 	
    	paintOvale(g);
    	paintLine(g);
    }
    
    public void paintOvale(Graphics g) {
    	height=etat.getHeight();
    	g.clearRect(X,HAUT-height-(1/2*HAUTEUR),LARGEUR,HAUTEUR);	
        g.drawOval(X,HAUT-height-(1/2*HAUTEUR),LARGEUR,HAUTEUR); 
    }
    
    public void paintLine(Graphics g) {
    	 ArrayList<Point>point=etat.getParcours();
         for(int j=0;j<point.size()-1;j++) {
 			 Point a = point.get(j);
 			 Point b = point.get(j+1);
 			 g.drawLine(a.x, a.y, b.x,b.y);
 			 //System.out.printf("a.x%d, a.y%d, b.x%d,b.y%d\n",a.x, a.y, b.x,b.y);
 			}
    }
    

  
  

}

