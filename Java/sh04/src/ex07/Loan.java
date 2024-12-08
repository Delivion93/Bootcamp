package ex07;

public class Loan implements Lendable{
    private int amount;
    private float debt;
    private String holder;

    public Loan(int amount, String holder) {
        this.amount = amount;
        this.holder = holder;
    }

    public int getAmount() {
        return amount;
    }

    public float getDebt() {
        return debt;
    }

    public String getHolder() {
        return holder;
    }

    @Override
    public void lend() {
        System.out.println(holder+" took a loan of "+amount);
        debt+=(amount*0.05f);
    }

    @Override
    public void giveBack() {
        System.out.println(holder+" return loan of "+amount);
        debt-=(amount*0.05f);
        if(debt<0){
            debt=0;
        }
    }
}