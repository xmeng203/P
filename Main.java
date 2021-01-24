
import javax.swing.*;
/** La classe principale */
public class Main {
	public static void main(String [] args) {
		Parcours parcours=new Parcours();
		Etat etat= new Etat(parcours);
		Affichage affichage= new Affichage(etat);		
		Control control=new Control(affichage,etat);
	//	Voler voler = new Voler(etat,affichage);
	//	Avancer avancer = new Avancer(etat,affichage);
		
		JFrame fenetre = new JFrame ("Flappy Bird");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.add(affichage);
		fenetre.addMouseListener(control);
		
		
		fenetre.pack();
		fenetre.setVisible(true);	
	 }
}
