package com.timberkito.cqytc.class14;

public class MobileShop {
	InnerPurchaseMoney purchaseMoney1;//用内部类InnerPurchaseMoney声明对象purchaseMoney1
	InnerPurchaseMoney purchaseMoney2;  //用内部类InnerPurchaseMoney声明对象purchaseMoney2
    private int mobileAmount;  //手机的数量
    MobileShop(){
    	purchaseMoney1 = new  InnerPurchaseMoney(20000);//创建价值为20000的purchaseMoney1
    	purchaseMoney2 = new  InnerPurchaseMoney(10000);//创建价值为10000的purchaseMoney2
    }
    void setMobileAmount(int m) {
        mobileAmount = m;
    }
    int getMobileAmount() {
        return mobileAmount;
    }

   //内部类
   class InnerPurchaseMoney {
        int moneyValue;
        InnerPurchaseMoney(int m) {
            moneyValue =  m;
        }
        void buyMobile() {
           if(moneyValue>=20000) {
              mobileAmount = mobileAmount-6; 
              System.out.println("用价值"+moneyValue+"的内部购物卷买了6部手机");
           }
           else if(moneyValue<20000&&moneyValue>=10000) {
              mobileAmount = mobileAmount-3; 
              System.out.println("用价值"+moneyValue+"的内部购物卷买了3部手机");
           }
        }
   } 
}
