package bsu.rfe.java.group7.laba1.Kochetkova.VarA12;

public class Tea extends Food {

    protected String color = "";
    @Override
    public void consume() {
        System.out.println(  this.toString()+  " выпит");
    }
    public Tea(String color){
        super("Tea");
        this.color = color;
    }
}
