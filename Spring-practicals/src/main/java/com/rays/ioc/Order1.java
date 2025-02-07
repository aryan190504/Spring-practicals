package com.rays.ioc;

public class Order1 {

	private Payment payment;
	private Inventory inventory;

	// setter injection......
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	// setter injection.....
	public void setInventory() {
		this.inventory = inventory;
	}

	public void bookATicket(int items) {

		int price = 10;

		double totalAmount = items * price;

		double updateBalance = payment.makePayment(totalAmount);

		int updatedStock = inventory.sold(items);

		System.out.println("Tickets are booked");
		System.out.println("Total Amount Paid:" + totalAmount);
		System.out.println("Remaining Balance:" + updateBalance);
		System.out.println("Update Stock: " + updatedStock);
	}

}
