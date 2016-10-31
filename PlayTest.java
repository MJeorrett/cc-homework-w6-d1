import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PlayTest {

  Play hamlet;
  Actor tomCruise;

  @Before
  public void before() throws ActorException {
    this.hamlet = new Play( "Hamlet", 5, 2 );
    this.tomCruise = new Actor( "Tom", "Cruise", 'm' );
  }

  @Test
  public void testHasName() {
    assertEquals( "Hamlet", hamlet.getName() );
  }

  @Test
  public void testHasNumberMaleRoles() {
    assertEquals( 5, hamlet.getNumberMaleRoles() );
  }

  @Test
  public void testHasNumberFemaleRoles() {
    assertEquals( 2, hamlet.getNumberFemaleRoles() );
  }

  @Test
  public void testHasCastSize() {
    assertEquals( 7, hamlet.castSize() );
  }

  @Test
  public void testAvailableMaleRolesInitialisedCorrectly() {
    assertEquals( 5, hamlet.availableMaleRoles() );
  }

  @Test
  public void
  testAvailableFemaleRolesInitialisedCorrectly() {
    assertEquals( 2, hamlet.availableFemaleRoles() );
  }

  @Test
  public void testNextRoleIndexStartsAtZero() {
    assertEquals( 0, hamlet.nextRoleIndex() );
  }

  @Test
  public void addingMaleActorReducesRolesAvailable() {
    hamlet.castActor( tomCruise );
  }

}
