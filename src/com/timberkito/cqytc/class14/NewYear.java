package com.timberkito.cqytc.class14;

public class NewYear {
	public static void main(String[] args) {
		MobileShop shop = new MobileShop();
	      shop.setMobileAmount(30);
	      System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
	      shop.purchaseMoney1.buyMobile();
	      shop.purchaseMoney2.buyMobile();
	      System.out.println("手机专卖店目前有"+shop.getMobileAmount()+"部手机");
	}
}
