package models;


public class Bill {
    private int momoquantity;
    private int burgerquantity;
    private int pizzaquantity;

    public Bill() {
        momoquantity = 0;
        burgerquantity = 0;
        pizzaquantity = 0;
    }

    public Bill(int momoquantity, int burgerquantity, int pizzaquantity) {
        this.momoquantity = momoquantity;
        this.burgerquantity = burgerquantity;
        this.pizzaquantity = pizzaquantity;
    }

    public int getMomoquantity() {
        return momoquantity;
    }

    public void setMomoquantity(int momoquantity) {
        this.momoquantity = momoquantity;
    }

    public int getBurgerquantity() {
        return burgerquantity;
    }

    public void setBurgerquantity(int burgerquantity) {
        this.burgerquantity = burgerquantity;
    }

    public int getPizzaquantity() {
        return pizzaquantity;
    }

    public void setPizzaquantity(int pizzaquantity) {
        this.pizzaquantity = pizzaquantity;
    }
    public void billgen(){
        int total=(momoquantity*400)+(burgerquantity*800)+(pizzaquantity*1200);
        System.out.println("----------Bill------------\n");
        System.out.println("Item\t Quantity\t Price\t\t Total\n"+
                            "Momo\t\t"+momoquantity+"\t\tRs 400\t\t"+ momoquantity*400 +"\n"+
                            "Burger\t\t"+burgerquantity+"\t\tRs 800\t\t"+ burgerquantity*800+"\n"+
                            "Pizza\t\t"+pizzaquantity+"\t\tRs 1200\t\t"+ pizzaquantity*1200+"\n"+
                            "Subtotal : "+ total); //(momoquantity*400 +burgerquantity*800+pizzaquantity*1200));
    }
}
