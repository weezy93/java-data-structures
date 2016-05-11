import java.util.ArrayList; // have to import

public class ArrayLists {

  public static void main(String[] args) {
    Student louisa = new Student(1, "Louisa", "Reese");
    String louisaFullName = louisa.getFullName();

    ArrayList<Student> students = new ArrayList<>();

    students.add(louisa);

    students.add(new Student(2, "Mike", "Dee"));

    for (Student student : students) {
      System.out.println(student.getId() + " " + student.getFullName());
    }

  }

}
