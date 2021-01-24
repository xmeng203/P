
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Control implements MouseListener{


			public Affichage affichage;
			public Etat etat;
			
			
			/** Constructeur */
			public Control(Affichage affichage, Etat etat) {
				this.affichage=affichage;
				this.etat=etat;
			}
			/** Controle */
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.printf("entrer\n");
				
				etat.jump();
				
				affichage.repaint();
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}


			

		
	    	
	    
	    
}
