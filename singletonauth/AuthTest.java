package singletonauth;

public class AuthTest {
    public static void main(String[] args) {
        AuthTest testSuite = new AuthTest();
        testSuite.runTests();
    }

    public void runTests() {
        testAuthenticationSuccess();
        testClearAuthToken();
        testTokenClearingEffect();
    }

    public void testAuthenticationSuccess() {
        AuthTokenManager.getInstance().setToken("user123", "token123");

        Server server = new Server();
        try {
            server.authenticateUser("user123", "token123");
            System.out.println("testAuthenticationSuccess passed.");
        } catch (Exception e) {
            System.err.println("testAuthenticationSuccess failed: " + e.getMessage());
        }
    }

    public void testClearAuthToken() {
        AuthTokenManager.getInstance().clearTokens();
    }

    public void testTokenClearingEffect() {
        AuthTokenManager.getInstance().setToken("user123", "token123");

        Server server = new Server();
        try {
            server.authenticateUser("user123", "token123");
            System.err.println("testTokenClearingEffect failed: User should not be authenticated.");
        } catch (Exception e) {
            System.out.println("testTokenClearingEffect passed.");
        }
    }
}
