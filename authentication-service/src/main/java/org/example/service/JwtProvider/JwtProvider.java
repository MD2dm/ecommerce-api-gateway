package org.example.service.JwtProvider;

import org.example.model.User;

import java.util.Map;

public interface JwtProvider {

    String generateToken(User user);

    String generateRefreshTokenToken(Map<String, Object> extraClaims, User user);

    String extractUsername(String token);

    boolean isTokenValid(String token, User user);
}
