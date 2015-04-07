package dimitri.android.insta.annuaire.entity;

public class PromotionEntity {
	/** Id de le promotion */
	private int id;
	
	/** numéro de la promotion */
	private String numPromotion;
	
	PromotionEntity(){
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the numPromotion
	 */
	public String getNumPromotion() {
		return numPromotion;
	}

	/**
	 * @param numPromotion the numPromotion to set
	 */
	public void setNumPromotion(String numPromotion) {
		this.numPromotion = numPromotion;
	}
	
}
