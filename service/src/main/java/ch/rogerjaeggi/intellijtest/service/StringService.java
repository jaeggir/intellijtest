package ch.rogerjaeggi.intellijtest.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class StringService {

    public String upper(String text) {
        return text.toUpperCase(Locale.ENGLISH);
    }

}
