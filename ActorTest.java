import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ActorTest {

  Actor tomCruise;

  @Before
  public void before() throws ActorException {
    tomCruise = new Actor( "Tom", "Cruise", 'm' );
  }

  @Test
  public void hadFirstName() {
    assertEquals( "Tom", tomCruise.getFirstName() );
  }

  @Test
  public void hasLastName() {
    assertEquals( "Cruise", tomCruise.getLastName() );
  }

  @Test
  public void hasGender() {
    assertEquals( 'm', tomCruise.getGender() );
  }

  @Test(expected = ActorException.class)
  public void exceptionRaisedIfBadGender() throws ActorException {
    Actor testActor = new Actor( "Test", "Smith", 'g' );
  }

}
