package com.luofragme.design.ObserverMode;

public class ObserverMode {
	public static void test() {
		ProductControl productControl = new ProductControl();
		NameObserver nameobs = new NameObserver();
		PriceObserver priceobs = new PriceObserver();
		Product product = new Product();
		productControl.setProduct(product);
		 productControl.register(priceobs, nameobs);
		product.setName("����");
		product.setPrice(1.22f);
	}
}