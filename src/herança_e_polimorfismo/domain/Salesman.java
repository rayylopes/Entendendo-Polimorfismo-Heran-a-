
package herança_e_polimorfismo.domain;


public non-sealed class Salesman extends Employee{
    private double percentPerSold;
    private double soldAmount;
    
    public Salesman(double percentPerSold, String code, String name, String address, int age, double salary, double soldAmount) {
        super(code, name, address, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }


    
    @Override
    public String getCode(){
       return "SL" + super.getCode();
    }

    public double getFullSalary(){
        return this.salary + (soldAmount * percentPerSold) / 100 ;
    }
    public Salesman(){
        
    }
    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
    
}
