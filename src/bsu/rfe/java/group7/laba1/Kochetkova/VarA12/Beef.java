package bsu.rfe.java.group7.laba1.Kochetkova.VarA12;

public class Beef extends Food  {

    protected String taste = "";

    @Override
    public void consume() {
        System.out.println(  this.toString()+  " съедено");
    }
    public Beef(String preparedness) {
        super("Beef");
        this.taste = preparedness;
    }
}
