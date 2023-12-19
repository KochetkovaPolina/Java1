package bsu.rfe.java.group7.laba1.Kochetkova.VarA12;

public class Cake extends Food {

    protected String icing = "";

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " съеден");
    }
    public Cake(String icing){
        super("Cake");
        this.icing = icing;
    }
}
