
public class Voler extends Thread{
    public  Etat etat;
    public Affichage affichage;
    public Voler(Etat etat, Affichage affichage) {
    	this.etat=etat;
    	this.affichage=affichage;
    }
	@Override
	public void run() {
		while(true) {
			etat.MoveDown();
			affichage.revalidate();
			affichage.repaint();
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
