package rest_impl;

import java.time.LocalDate;

public class Message {
	private String receipant;
	private String content;
	private LocalDate deliveryDate;

	public Message() {
	}

	@Override
	public String toString() {
		return "Message [receipant=" + receipant + ", content=" + content + ", deliveryDate=" + deliveryDate + "]";
	}

	public String getReceipant() {
		return receipant;
	}

	public void setReceipant(String receipant) {
		this.receipant = receipant;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Message(String receipant, String content, LocalDate deliveryDate) {
		this.receipant = receipant;
		this.content = content;
		this.deliveryDate = deliveryDate;
	}
}
