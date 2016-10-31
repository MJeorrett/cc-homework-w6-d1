class Actor {

  String firstName;
  String lastName;
  char gender;

  public Actor ( String firstName, String lastName, char gender ) throws ActorException {

    if ( gender != 'm' && gender != 'f' ) {
      throw new ActorException("Gender must be either 'm' or 'f'");
    }
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
