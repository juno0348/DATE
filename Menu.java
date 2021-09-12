class Menu{
    String name;
    int price;
    boolean takeout;
    int quantity;
    float sale = 0.3f;

    public Menu(String name, int price){
        this.name = name;
        this.price = price;
        this.takeout = false;
        this.quantity = 0;
    }

    public Menu(String name, int price, boolean takeout){
        this.name = name;
        this.price = price;
        this.takeout = takeout;
        this.quantity = 0;
    }

    public Menu(String name, int price, boolean takeout, int quantity){
        this.name = name;
        this.price = price;
        this.takeout = takeout;
        this.quantity = quantity;
    }

    public int getPrice(){
        return (int)((float)(this.price * 0.7));
    }

    @Override
    public String toString(){
        return "이름 : "+name+" 가격 : "+price+"원";
    }
}