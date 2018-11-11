package my.mmshulga.chucknorrisjokesapp.controller;

import my.mmshulga.chucknorrisjokesapp.service.RandomQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final RandomQuoteService randomQuoteService;

    @Autowired
    public JokesController(RandomQuoteService randomQuoteService) {
        this.randomQuoteService = randomQuoteService;
    }

    @RequestMapping({"/", ""})
    public String getIndex(Model model) {
        String joke = randomQuoteService.getRandomQuote();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
