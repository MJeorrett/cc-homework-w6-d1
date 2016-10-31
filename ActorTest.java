import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ActorTest {

  Actor tomCruise;

  @Before
  public void before() throws ActorException {
    tomCruise = new Actor( "Tom", "Cruise", 'm' );
  }

  @Test
  public void testHadFirstName() {
    assertEquals( "Tom", tomCruise.getFirstName() );
  }

  @Test
  public void testHasLastName() {
    assertEquals( "Cruise", tomCruise.getLastName() );
  }

  @Test
  public void testHasGender() {
    assertEquals( 'm', tomCruise.getGender() );
  }

  @Test(expected = ActorException.class)
  public void testExceptionRaisedIfBadGender() throws ActorException {
    Actor testActor = new Actor( "Test", "Smith", 'g' );
  }

}
