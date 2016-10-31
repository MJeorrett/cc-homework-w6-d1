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
    int maleRolesCast = numberRolesCastForGender( 'm' );
    return getNumberMaleRoles() - maleRolesCast;
  }

  public int availableFemaleRoles() {
    int femaleRolesCast = numberRolesCastForGender( 'f' );
    return getNumberFemaleRoles() - femaleRolesCast;
  }

  public int nextRoleIndex() {
    int nextRoleIndex = 0;

    for ( Actor actor : cast ) {
      if ( actor != null ) {
        nextRoleIndex++;
      }
    }

    return nextRoleIndex;
  }

  public void castActor( Actor actor ) {
    int nextIndex = nextRoleIndex();
    cast[nextIndex] = actor;
  }

  private int numberRolesCastForGender( char gender ) {
    int numberRolesCast = 0;

    for ( Actor actor : cast ) {
      if ( actor != null && actor.gender == gender ) {
        numberRolesCast++;
      }
    }

    return numberRolesCast;
  }

}
