package app.intech;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueAppWords {

    public static List<String> process(List<String> input) {
        return input.stream()
                .filter(Objects::nonNull) // Игнорируем null
                .map(s -> s
                        .replaceAll("[aA]", "4") // Заменяем 'a' и 'A' на '4'
                        .toUpperCase() // Переводим в верхний регистр
                )
                .distinct() // Уникальные значения
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("anna", "AnNa123", "butterfly", "aAa", "ANNA", "-1", "");
        List<String> result = UniqueAppWords.process(input);
        System.out.println(result);
    }
}
