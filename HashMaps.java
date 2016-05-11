import java.util.HashMap;

public class HashMaps {

  public static void main(String[] args) {

    HashMap<Integer, String> students = new HashMap<>();

    students.put(1, "Karan Withrow");
    students.put(2, "Tonya Fitting");
    students.put(3, "April Fronk");
    students.put(4, "Marylouise Haake");
    students.put(5, "Temika Berthiaume");

    System.out.println("---Student HashMap---");
    for(String student : students.values()) {
      System.out.println(student);
    }

    for (Integer id : students.keySet()) {
      System.out.println(id + " " + students.get(id));
    }
  }
}
