package domaine;

/**
 * Classe de gestion des comptes
 * @author Adminl
 * @version 1.0 
 */
public class Compte {

	// Attributs
	/**
	 * idCompte num�ro de compte
	 */
	protected int idCompte;
	/**
	 * solde du compte
	 */
	protected double solde;

	// Getters & Setters

	/**
	 * 
	 * @return retourne le num�ro de compte
	 */
	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * 
	 * @return le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	// To String
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + "]";
	}
	
	/**
	 * m�thode de retrait dans un compte
	 * @param mt montant � retirer
	 * @throws MontantNegatifException g�re les montants n�gatifs � retirer 
	 * @throws SoldeInsuffisantException  g�re le solde insuffisant
	 */
	public void retirer(double mt) throws MontantNegatifException, SoldeInsuffisantException {
		if(mt<0) throw new MontantNegatifException("Montant retir� n�gatif");
		if(solde-mt<0) throw new SoldeInsuffisantException("Solde insuffisant");
		solde -= mt;
	}

	
	/**
	 * m�thode de versement dans un compte
	 * @param mt montant � verser
	 * @throws MontantNegatifException g�re le solde insuffisant
	 * 
	 */
	public void verser(double mt) throws MontantNegatifException{
		if(mt<0) throw new MontantNegatifException("Montant vers� n�gatif");
		solde += mt;
	}
	
	
}
