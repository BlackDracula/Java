package Midterm;
public class Printing {
    private int qty;
    private String type;

    public Printing() {
        qty = 0;
        type = "null";
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getType() {
        return this.type;
    }
    @Override public String toString() {
        int price =0;
        if (this.type.equals("AAA"))
            price = 100;
        else
            price = 100000;
        String mine =Integer.toString(price);
        return mine;
    }
}
