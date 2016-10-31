class Play {

  String name;
  int numberMaleRoles;
  int numberFemaleRoles;
  Actor[] cast;

  public Play( String name, int numberMaleRoles, int numberFemaleRoles ) {
    this.name = name;
    this.numberMaleRoles = numberMaleRoles;
    this.numberFemaleRoles = numberFemaleRoles;
    int castSize = numberMaleRoles + numberFemaleRoles;
    cast = new Actor[castSize];
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
    return this.cast.length;
  }

  public int availableMaleRoles() {
    int maleRolesCast = 0;

    for ( Actor actor : cast ) {
      if ( actor != null && actor.gender == 'm' ) {
        maleRolesCast++;
      }
    }

    return getNumberMaleRoles() - maleRolesCast;
  }

}
