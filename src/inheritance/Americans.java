package inheritance;

public class Americans extends Human{
    private String ascent;

    public Americans(int age, String name, String nation, String ascent){
        super(age, name, nation);
        this.ascent = ascent;
    }

}
