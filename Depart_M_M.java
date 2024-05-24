package proj;

public class Depart_M_M implements Operation{

	@Override
	public Etat Action(Etat e) {
		Etat_CM etat_courant=(Etat_CM) e;
		int varLoc1=3-etat_courant.getNbre_missionaire()+2;
		int varLoc2=(3-etat_courant.getNbre_cannibales());
		if( (etat_courant.isBateau()==true && etat_courant.getNbre_missionaire()>=2 )&&(varLoc1>=varLoc2)&& (etat_courant.getNbre_cannibales()<=etat_courant.getNbre_missionaire()-2|| etat_courant.getNbre_missionaire()-2==0) ){
			return new Etat_CM(etat_courant.getNbre_missionaire()-2,etat_courant.getNbre_cannibales(),false);
		}
		return null;
	}
	@Override
	public String toString() {
		return "Departure_M_M   ==>   ";
	}
}
