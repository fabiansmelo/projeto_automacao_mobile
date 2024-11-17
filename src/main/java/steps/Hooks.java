package steps;


import static utils.Utils.acessarApp;
import static utils.Utils.driver;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUP() throws Exception {
        acessarApp();
    }

    @After
    public void fecharApp(Scenario cenario) {
        utils.Utils.gerarCenario(cenario);
        driver.quit();
    }

}
