import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PlayTest {

  Play hamlet;
  Actor tomCruise;
  Actor pamRogers;

  @Before
  public void before() throws ActorException {
    this.hamlet = new Play( "Hamlet", 5, 2 );
    this.tomCruise = new Actor( "Tom", "Cruise", 'm' );
    this.pamRogers = new Actor( "Pam", "Rogers", 'f' );

  }

  @Test
  public void hasName() {
    assertEquals( "Hamlet", hamlet.getName() );
  }

  @Test
  public void hasNumberMaleRoles() {
    assertEquals( 5, hamlet.getNumberMaleRoles() );
  }

  @Test
  public void hasNumberFemaleRoles() {
    assertEquals( 2, hamlet.getNumberFemaleRoles() );
  }

  @Test
  public void hasCastSize() {
    assertEquals( 7, hamlet.castSize() );
  }

  @Test
  public void availableMaleRolesInitialisedCorrectly() {
    assertEquals( 5, hamlet.availableMaleRoles() );
  }

  @Test
  public void
  availableFemaleRolesInitialisedCorrectly() {
    assertEquals( 2, hamlet.availableFemaleRoles() );
  }

  @Test
  public void nextRoleIndexStartsAtZero() {
    assertEquals( 0, hamlet.nextRoleIndex() );
  }

  @Test
  public void addingMaleActorReducesRolesAvailable() {
    hamlet.castActor( tomCruise );
    assertEquals( 4, hamlet.availableMaleRoles() );
  }

  @Test
  public void addingFemaleActorReducesRolesAvailable() {
    hamlet.castActor( pamRogers );
    assertEquals( 1, hamlet.availableFemaleRoles() );
  }

  @Test
  public void cantAddTooManyMaleActors() throws ActorException {

    for ( int i = 0; i < 10; i++ ) {
      Actor testActor = new Actor( "testFirst", "testLast", 'm' );
      hamlet.castActor( testActor );
    }

    assertEquals( 0, hamlet.availableMaleRoles() );
    assertEquals( 2, hamlet.availableFemaleRoles() );
  }

  @Test
  public void cantAddTooManyFemaleActors() throws ActorException {

    for ( int i = 0; i < 10; i++ ) {
      Actor testActor = new Actor( "testFirst", "testLast", 'f' );
      hamlet.castActor( testActor );
    }

    assertEquals( 5, hamlet.availableMaleRoles() );
    assertEquals( 0, hamlet.availableFemaleRoles() );
  }

}
