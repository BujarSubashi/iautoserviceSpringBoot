package com.cindytech.iautoservice.test;

import com.cindytech.iautoservice.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestOrder {

	public static void main(String[] args) {

		 Inventory inventory = new Inventory();
		//CREATE SUPPLIER FOR ORDER TEST
		Supplier supplier = new Supplier("Test Supplier", "I12587E", "Tyres Supplier", "0682020200", "0682020112", "test@supplier.com", "note", "category", "Suplier");
		
		//CREATE PART FOR TETSING ORDER
		Part part1 = new Part();
		Part part2 = new Part();
		
		part1.setProductId(1);
		part2.setProductId(2);
		
		// Creazione dell'ordine
		Order order = new Order();
		//order.setOrderDate(LocalDate.now());
		order.setCompletionTime(new Date());
		order.setSupplier(supplier);
		
				
		// Aggiunta di parti all'ordine
		List<PartPurchase> purchaseParts = new ArrayList<>();
		purchaseParts.add(new PartPurchase(part1, supplier.getName(),  25.0 , 35.0, 50));
		purchaseParts.add(new PartPurchase(part2, supplier.getName(),  35.0 , 45.0, 100)); 
		order.setPartPurchases(purchaseParts);

		// Salvataggio del nuovo inventory e inventoryItem
		for (PartPurchase purchasePart : purchaseParts) {
		  Part part = purchasePart.getPart();
		  int quantity = purchasePart.getQuantity();
		  double purchasePrice = purchasePart.getPurchasePrice();
		  double sellPrice = purchasePart.getSellPrice();

		  // Creazione di un nuovo inventoryItem
		  InventoryItem inventoryItem = new InventoryItem(part1,quantity, purchasePrice, sellPrice);

		  // Salvataggio del nuovo inventoryItem
//		  inventoryItem.save(inventoryItem);

		  // Aggiornamento dell'inventory esistente con la nuova quantità e il nuovo prezzo di acquisto
//		  inventory = inventory.findByPart(part);
//		  if (inventory == null) {
//		    inventory = new Inventory();
//		    inventory.addItem(inventoryItem);
//		    inventory.save(inventory);
//		  } else {
//		    int oldQuantity = inventory.getQuantity(inventoryItem);
//		    double oldPurchasePrice = inventoryItem.getPurchasePrice();
//		    double newPurchasePrice = (oldPurchasePrice * oldQuantity + purchasePrice * quantity) / (oldQuantity + quantity);
//		    int newQuantity = oldQuantity + quantity;
//		    inventoryItem.setQuantity(newQuantity);
//		    inventoryItem.setPurchasePrice(newPurchasePrice);
//		    inventoryItem.update(inventoryItem);
//		  }
		}
//
//		// Aggiornamento dell'ordine con lo stato "Arrivato"
//		order.markAsCompleted();
//		order.update(order);
	}

}
