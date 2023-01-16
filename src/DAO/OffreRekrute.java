package DAO;

public class OffreRekrute extends Offre{
	protected String DateE;



	public OffreRekrute(String secteur, String fonction, String experience, String niveauEtude, String typeContrat,
			String datePublication, int nbPostes, String titreOffre, String dateE) {
		super(secteur, fonction, experience, niveauEtude, typeContrat, datePublication, nbPostes, titreOffre);
		DateE = dateE;
	}

	public String getDateE() {
		return DateE;
	}

	public void setDateE(String dateE) {
		DateE = dateE;
	}
	
	
}
