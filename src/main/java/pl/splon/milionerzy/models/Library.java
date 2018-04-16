package pl.splon.milionerzy.models;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Library {

    Question question1 = new Question("Klasa w Javie:", "To dowolna funkcja programu",
            "Tworzy nowe instancje", "To szablon do tworzenia obiektów", "Zestaw czcionek", 3);
    Question question2 = new Question("Lambdy pojawiły się w: ", "Java 5", "Java 8", "Java 9", "Były od początku", 2);
    Question question3 = new Question("Tablice w Javie: ", "Nie muszą mieć zadeklarowanej wartoci ", "Muszą mieć zadeklarowaną wielkość przy tworzeniu", "Ustalają swoją wielkość na podstawie liczby elementów", "Nie mogą przechowywać typów prostych", 2);
    Question question4 = new Question("TO KONIEC WIĘCEJ PYTAŃ WKRÓTCE :-)", "Nie muszą mieć zadeklarowanej wartoci ", "Muszą mieć zadeklarowaną wielkość przy tworzeniu", "Ustalają swoją wielkość na podstawie liczby elementów", "Nie mogą przechowywać typów prostych", 2);




}
