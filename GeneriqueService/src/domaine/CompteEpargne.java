package domaine;

public class CompteEpargne extends Compte {

	// Attributs

	private double pourcentage;

	// Getters & Setters

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	// To String

	@Override
	public String toString() {
		return "CompteEpargne [pourcentage=" + pourcentage + ", idCompte=" + idCompte + ", solde=" + solde + "]";
	}

	// Constructeur

	public CompteEpargne(double pourcentage) {
		super();
		this.pourcentage = pourcentage;
	}

	public CompteEpargne(int idCompte, double solde, double pourcentage) {
		super.idCompte = idCompte;
		super.solde = solde;
		this.pourcentage = pourcentage;
	}

	public CompteEpargne(int idCompte, double solde, Personne proprietaire, double pourcentage) {
		super.idCompte = idCompte;
		super.solde = solde;
		super.proprietaire = proprietaire;
		this.pourcentage = pourcentage;
	}
	
	
	

}
