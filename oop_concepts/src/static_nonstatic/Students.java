package static_nonstatic;
import java.util.Scanner;

public class Students extends Person implements Guest {
    public void getValues() {
    }

    public static void getName() {
    }

    public static void main(String[] args) {
        Students.getName();

        Students hello = new Students();
        hello.getValues();


        Scanner sc = new Scanner(System.in);

    }

    @Override
    public void sayHello(String name) {

    }

    @Override
    public String getNames() {
        return "";
    }

    @Override
    public void getEmail(String name) {

    }
}
