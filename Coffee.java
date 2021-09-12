class Coffee extends Beverage{
    String beans;

    public Coffee(String name, int price, boolean ice, String beans){
        super(name, price, ice);
        this.beans = beans;
    }

    @Override
    public String toString(){
        return "이름 : "+name+" 가격 : "+price+"원 "+(this.ice ? " 아이스" : " 핫")+" "+beans;
    }
}