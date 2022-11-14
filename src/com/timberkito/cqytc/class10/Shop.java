package com.timberkito.cqytc.class10;

public class Shop {
    private String[] types;

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void showComputer() {
        for (int i = 0; i < this.types.length; i++) {
            System.out.println(types[i]);
        }
    }

    public void chooseComputer(String type) {
        switch (type) {
            case "台式机":
                new DesktopComputer().advantage();
                break;
            case "笔记本":
                new LaptopComputer().advantage();
                break;
            case "商务笔记本":
                new BusinessLaptop().advantage();
                break;
            case "游戏本":
                new GameLaptop().advantage();
                break;
            default:
                System.out.println("商场没有这种商品！");
                break;
        }
    }
}
