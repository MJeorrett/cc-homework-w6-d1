class Actor {

  String firstName;
  String lastName;
  char gender;

  public Actor( String firstName, String lastName, char gender ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public char getGender() {
    return this.gender;
  }

}
