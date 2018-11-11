package my.mmshulga.chucknorrisjokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteServiceImpl implements RandomQuoteService {

    private static final ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();

    @Override
    public String getRandomQuote() {
        return cnq.getRandomQuote();
    }
}
