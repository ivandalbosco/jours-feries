package ch.ge.cti.ct.FerieGeneve.persistance;

public interface ParamFermesAble {
	/**
	 * Retourne la liste des jours �tats ferm�s pour une ann�e donn�es
	 * @param annee
	 * @return la liste des jours ferm�s au format dd/MM
	 */
	public String[] getJoursFermes(int annee);
}
