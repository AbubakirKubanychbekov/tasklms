public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        super.Learn();
        super.walk();
        super.eat();
        System.out.println(getName()+" Singer sing");
    }
    public void playGuiter(){
        super.Learn();
        super.walk();
        super.eat();
        System.out.println(getName()+" Play guitar ");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}


