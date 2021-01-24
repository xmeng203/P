
public class Avancer extends Thread {

	
	public  Etat etat;

	public Affichage affichage;

	public Avancer(Etat etat, Affichage affichage) {
		this.etat=etat;

		this.affichage=affichage;
	}
	
	
	@Override
	public void run() {
		 while(true)
	        {
	
	            etat.setPosition();
	            affichage.revalidate();
	            affichage.repaint();
	            try{
	                Thread.sleep(1000);
	                
	            } catch (Exception e) {
	                e.printStackTrace();
	            }

	}
}
}
