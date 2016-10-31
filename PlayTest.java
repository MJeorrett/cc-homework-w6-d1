import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PlayTest {

  Play hamlet;

  @Before
  public void before() {
    this.hamlet = new Play( "Hamlet", 5, 2 );
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

}
