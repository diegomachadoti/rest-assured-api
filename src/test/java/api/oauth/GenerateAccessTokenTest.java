package api.oauth;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class GenerateAccessTokenTest {


    @Test(groups = {"unittest"})
    public void tokenGenerated() {
        assertFalse(new GenerateAccessToken().getAccessToken().isEmpty(), "Access token está vazio");
    }
}
