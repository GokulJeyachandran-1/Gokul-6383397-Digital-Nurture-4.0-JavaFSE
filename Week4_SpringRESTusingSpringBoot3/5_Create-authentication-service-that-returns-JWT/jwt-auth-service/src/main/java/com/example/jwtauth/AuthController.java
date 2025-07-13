package com.example.jwtauth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Map;

@RestController
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
    this.jwtUtil = jwtUtil;
    System.out.println("JwtUtil injected: " + (jwtUtil != null));
}

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        try {
            String authHeader = request.getHeader("Authorization");
            System.out.println("Authorization Header: " + authHeader);
            if (authHeader == null || !authHeader.startsWith("Basic ")) {
                return ResponseEntity.badRequest().body(Map.of("error", "Missing or malformed Authorization header"));
            }

            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] credDecoded = Base64.getDecoder().decode(base64Credentials);
            String credentials = new String(credDecoded);
            String[] values = credentials.split(":", 2);

            if (values.length != 2) {
                return ResponseEntity.badRequest().body(Map.of("error", "Invalid credentials format"));
            }

            String username = values[0];
            String password = values[1];

            // Dummy user check
            if ("user".equals(username) && "pwd".equals(password)) {
    String token = jwtUtil.generateToken(username);
    return ResponseEntity.ok(Map.of("token", token));
} else {
    return ResponseEntity.status(401).body(Map.of("error", "Invalid username or password"));
}


        } catch (Exception e) {
    e.printStackTrace();  // log in terminal
    return ResponseEntity.status(500).body(
        Map.of(
            "type", e.getClass().getName(),
            "message", e.getMessage() == null ? "null message" : e.getMessage()
        )
    );
}

    }
}
