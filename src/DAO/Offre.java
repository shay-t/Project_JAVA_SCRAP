package DAO;

public class Offre {
	private String Secteur;
	private String Fonction;
	private String Experience;
	private String NiveauEtude;
	private String TypeContrat;
	private String DatePublication;
	private int NbPostes;
	private String TitreOffre;
	
	public Offre() {
		
	}



	public Offre(String secteur, String fonction, String experience, String niveauEtude, String typeContrat,
			String datePublication, int nbPostes, String titreOffre) {
		Secteur = secteur;
		Fonction = fonction;
		Experience = experience;
		NiveauEtude = niveauEtude;
		TypeContrat = typeContrat;
		DatePublication = datePublication;
		NbPostes = nbPostes;
		TitreOffre = titreOffre;
	}



	public String getSecteur() {
		return Secteur;
	}

	public void setSecteur(String secteur) {
		Secteur = secteur;
	}

	public String getFonction() {
		return Fonction;
	}

	public void setFonction(String fonction) {
		Fonction = fonction;
	}

	public String getExperience() {
		return Experience;
	}

	public void setExperience(String experience) {
		Experience = experience;
	}

	public String getNiveauEtude() {
		return NiveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		NiveauEtude = niveauEtude;
	}

	public String getTypeContrat() {
		return TypeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		TypeContrat = typeContrat;
	}

	public String getDatePublication() {
		return DatePublication;
	}

	public void setDatePublication(String datePublication) {
		DatePublication = datePublication;
	}

	public int getNbPostes() {
		return NbPostes;
	}

	public void setNbPostes(int nbPostes) {
		NbPostes = nbPostes;
	}

	public String getTitreOffre() {
		return TitreOffre;
	}

	public void setTitreOffre(String titreOffre) {
		TitreOffre = titreOffre;
	}

	@Override
	public String toString() {
		return "Offre [Secteur=" + Secteur + ", Fonction=" + Fonction + ", Experience=" + Experience + ", NiveauEtude="
				+ NiveauEtude + ", TypeContrat=" + TypeContrat + ", DatePublication=" + DatePublication + ", NbPostes="
				+ NbPostes + ", TitreOffre=" + TitreOffre + "]";
	}
	public void Affiche() {
		System.out.println(toString());
	}
}
