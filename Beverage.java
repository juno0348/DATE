class Beverage extends Menu{
    boolean ice;

    public Beverage(String name, int price, boolean ice){
        super(name, price);
        this.ice = ice;
    }

    @Override
    public int getPrice(){
        return (int)((float)(this.price * 0.5));
    }

    @Override
    public String toString(){
        return "이름 : "+name+" 가격 : "+price+"원 "+(this.ice ? " 아이스" : " 핫");
    }
}