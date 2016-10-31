class Play {

  String name;
  int numberMaleRoles;
  int numberFemaleRoles;
  Actor[] actors;

  public Play( String name, int numberMaleRoles, int numberFemaleRoles ) {
    this.name = name;
    this.numberMaleRoles = numberMaleRoles;
    this.numberFemaleRoles = numberFemaleRoles;
    int castSize = numberMaleRoles + numberFemaleRoles;
    actors = new Actor[castSize];
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

  public int castSize() {
    return this.actors.length;
  }

}
