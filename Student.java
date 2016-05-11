public class Student {

  private int id;
  private String firstName;
  private String lastName;

  public Student (int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // getters and setters
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName () {
      return this.firstName;
    }

  public void setFirstName (String firstName) {
    this.firstName = firstName;
  }

  public String getFullName () {
    return this.firstName + " " + this.lastName;
  }

}
