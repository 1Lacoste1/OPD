import java.io.Serializable;
import java.util.Scanner;

public abstract class InfoClass implements Serializable {
    protected String name, number_mobile, street, flat;
    protected int years_issue, home, deliv = 1000, price;
    protected String tip_device, brand, model, defects;

    @Override
    public abstract String toString();
}
