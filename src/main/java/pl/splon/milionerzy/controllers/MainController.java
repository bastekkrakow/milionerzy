package pl.splon.milionerzy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.splon.milionerzy.models.Library;
import pl.splon.milionerzy.models.Question;

import java.util.ArrayList;
import java.util.List;

@Controller
@Scope(value = "session")
public class MainController {

    int counter;
    int points;

    final
    Library library;

    List<Question> lista = new ArrayList<>();

    @Autowired
    public MainController(Library library) {
        this.library = library;
    }

    @GetMapping("/")
    public String index(Model model) {
        lista.add(library.getQuestion1());
        lista.add(library.getQuestion2());
        lista.add(library.getQuestion3());
        lista.add(library.getQuestion4());
        points = 0;
        model.addAttribute("question", lista.get(0));
        model.addAttribute("points", points);
        return "index";
    }

    @PostMapping("/getWeatherController")
    public String question(@RequestParam("weatherType") String answer,
                           Model model) {
        if (Integer.parseInt(answer) == lista.get(counter).getCorrect()) points++;
        counter++;
        if (counter > lista.size()-1){points=0;
        counter=0;}
        model.addAttribute("question", lista.get(counter));
        model.addAttribute("points", points);
        return "index";
    }


}
