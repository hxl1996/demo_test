package com.demo.utils;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence RawPassword) {
        return RawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence RawPassword, String EncodePassword) {
        return EncodePassword.equals(RawPassword.toString());
    }
}
