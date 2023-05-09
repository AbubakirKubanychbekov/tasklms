// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Programmer");
        Programmer programmer=new Programmer("Abubakir","Kubanychbekov","Amazon");
        programmer.coding();
        System.out.println(programmer);

        System.out.println("------------");
        System.out.println("Dancer");
        Dancer dancer=new Dancer("Atai","Omurzakov","Tumar");
        dancer.dancing();
        System.out.println(dancer);

        System.out.println("-------------");
        System.out.println("Singer");
        Singer singer=new Singer("Mirbek","Atabekov","band");
        singer.getBandName();
        singer.playGuiter();
        System.out.println(singer);
    }
}