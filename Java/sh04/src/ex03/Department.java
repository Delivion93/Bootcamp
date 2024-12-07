package ex03;

public enum Department {
    ACCOUNTING("accounting",50),
    COMPUTING("computing",80),
    MANAGEMENT("management",100);

    private final String name;
    private final int premium;
    Department(String name, int premium){
        this.name=name;
        this.premium=premium;
    }

    public String getName(){
        return name;
    }

    public int getPremium(){
        return premium;
    }

}
