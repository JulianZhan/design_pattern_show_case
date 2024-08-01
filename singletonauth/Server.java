package singletonauth;

public class Server {
    public void authenticateUser(String userId, String token) {
        AuthTokenManager tokenManager = AuthTokenManager.getInstance();
        String storedToken = tokenManager.getToken(userId);

        if (token.equals(storedToken)) {
            System.out.println("User authenticated.");
        } else {
            throw new RuntimeException("Authentication failed.");
        }
    }
}
