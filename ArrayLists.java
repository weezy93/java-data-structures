import java.util.ArrayList; // have to import

public class ArrayLists {

  public static void main(String[] args) {
    ArrayList<String> students = new ArrayList<>();

    students.add("Karan Withrow");
    students.add("Tonya Fitting");
    students.add("April Fronk");
    students.add("Marylouise Haake");
    students.add("Temika Berthiaume");

    System.out.println("---After Initial Add---");
    for(String student : students) {
      System.out.println(student);
    }

  }

}
