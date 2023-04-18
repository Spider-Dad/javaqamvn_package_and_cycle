
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.VacationCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest { // объявляем тестовый класс с именем VacationCalculatorTest
    @ParameterizedTest
    // @CsvSource({
    //        "3,10000,3000,20000",
    //        "2,100000,60000,150000"
    //})
    @CsvFileSource(files = "src/test/resources/VacationArguments.csv")
    public void testCalculateVacationMonths(int expected, int income, int expenses, int threshold) { // объявляем метод с именем testCalculateVacationMonths c входными данными . Не возвращает значение, т.к. указан тип "void"
        VacationCalculator calculator = new VacationCalculator();

        // @ParameterizedTest Проверяем количество месяцев отдыха для различных параметров по заданию
        // указваем входные данные через @CsvSource
        // expected =  3, income = 10000, expenses = 3000, threshold = 20000
        // expected =  2, income = 100000, expenses = 60000, threshold = 150000

        int actual = calculator.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

        // @Test Проверяем количество месяцев отдыха для различных параметров по заданию

        // income = 10000, expenses = 3000, threshold = 20000
        // expected : 3 месяца
        // assertEquals(3, calculator.calculateVacationMonths(10_000, 3_000, 20_000));

        // income = 100000, expenses = 60000, threshold = 150000
        // expected: 2 месяцев
        // assertEquals(2, calculator.calculateVacationMonths(100_000, 60_000, 150_000));

    }

}
