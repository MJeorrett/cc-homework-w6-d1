class Play {

  String name;
  int numberMaleRoles;
  int numberFemaleRoles;

  public Play( String name, int numberMaleRoles, int numberFemaleRoles ) {
    this.name = name;
    this.numberMaleRoles = numberMaleRoles;
    this.numberFemaleRoles = numberFemaleRoles;
  }

  public String getName() {
    return this.name;
  }

  public int getNumberMaleRoles() {
    return this.numberMaleRoles;
  }

  public int getNumberFemaleRoles() {
    return this.numberFemaleRoles;
  }

}
