package example.hibernate.one_to_many_unidirectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Credit_card_master")
public class Creditcard {
	@Id
	@Column(name = "card_no", length = 30)
	private String cardNo;

	@Column(name = "card_Holder_Name", length = 30)
	private String nameHolderCard;

	@Column(name = "card_bankName", length = 30)
	private String bankName;

	@Column(name = "card_type", length = 30)
	private String type;

	@Column(name = "credit_Limit", length = 2)
	private int creditlimit;

	public Creditcard() {
	}

	public Creditcard(String cardNo, String nameHolderCard, String bankName, String type, int creditlimit) {
		this.cardNo = cardNo;
		this.nameHolderCard = nameHolderCard;
		this.bankName = bankName;
		this.type = type;
		this.creditlimit = creditlimit;
	}

	@Override
	public String toString() {
		return "Creditcard [cardNo=" + cardNo + ", nameHolderCard=" + nameHolderCard + ", bankName=" + bankName
				+ ", type=" + type + ", creditlimit=" + creditlimit + "]";
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getNameHolderCard() {
		return nameHolderCard;
	}

	public void setNameHolderCard(String nameHolderCard) {
		this.nameHolderCard = nameHolderCard;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(int creditlimit) {
		this.creditlimit = creditlimit;
	}
}
