package classes;

public class Shop<S> {
    public S[] shop;

    public Shop(Class<S> shop) {

    }

    public Shop() {

    }


//    public S[] getShop() {
//        return shop;
//    }
//
//    public void setShop(S[] shop) {
//        this.shop = shop;
//    }

    public void printObject(){
        System.out.println(shop);
    }
}
