package com.co.glamping.auth.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {
// NODE generate
    //node -e "console.log(require('crypto').randomBytes(32).toString('hex'))"
    private static final String SECRET_KEY="0653fb9afa2e960d638b0c7a8bc52e36a0983a5d21c323d9969f37dc4c187e85";
    public String getToken(UserDetails usuario) {
        return getToken(new HashMap<>(),usuario);
    }

    private String getToken(Map<String,Object> extraChain, UserDetails usuario) {
      return   Jwts
              .builder()
              .setClaims(extraChain)
              .setSubject(usuario.getUsername())
              .setIssuedAt(new Date(System.currentTimeMillis()))
              .setExpiration(new Date(System.currentTimeMillis()+1000*60*24))
              .signWith(getKey(), SignatureAlgorithm.HS256)
              .compact();

    }

    private Key getKey() {
            byte[] KeyBytes = Decoders.BASE64.decode(SECRET_KEY);
            return Keys.hmacShaKeyFor(KeyBytes);
    }


}
