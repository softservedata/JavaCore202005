package suites;

import login.InvalidLoginWithParameters;
import login.InvalidPassWithParams;
import login.LoginWithPageObject;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import searchZayavka.SearchZayavka;
import zayavki.CreateZayavka;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LoginWithPageObject.class,
                InvalidLoginWithParameters.class,
                InvalidPassWithParams.class,
                SearchZayavka.class,
                CreateZayavka.class
        }
)

public class SmokeSuite {


}
