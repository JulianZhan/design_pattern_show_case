package singletonauth;

import java.util.HashMap;
import java.util.Map;

public class AuthTokenManager {
    private static AuthTokenManager instance;
    private final Map<String, String> userTokens = new HashMap<>();

    private AuthTokenManager() {}

    public static synchronized AuthTokenManager getInstance() {
        if (instance == null) {
            instance = new AuthTokenManager();
        }
        return instance;
    }

    public void setToken(String userId, String token) {
        userTokens.put(userId, token);
    }

    public String getToken(String userId) {
        return userTokens.get(userId);
    }

    public void clearTokens() {
        userTokens.clear();
    }
}
