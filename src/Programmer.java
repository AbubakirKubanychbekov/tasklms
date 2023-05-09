public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void coding(){
        super.Learn();
        super.walk();
        super.eat();
        System.out.println(getName()+" Write coding");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
