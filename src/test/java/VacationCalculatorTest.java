
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.VacationCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationCalculatorTest { // объявляем тестовый класс с именем VacationCalculatorTest
    @Test
    public void testCalculateVacationMonths() { // объявляем метод с именем testCalculateVacationMonths. Не возвращает значение, т.к. указан тип "void"
        VacationCalculator calculator = new VacationCalculator();

        // Проверяем количество месяцев отдыха для различных параметров по заданию

        // income = 10000, expenses = 3000, threshold = 20000
        // Ожидаемый результат: 3 месяца
        assertEquals(3, calculator.calculateVacationMonths(10_000, 3_000, 20_000));

        // income = 100000, expenses = 60000, threshold = 150000
        // Ожидаемый результат: 2 месяцев
        assertEquals(2, calculator.calculateVacationMonths(100_000, 60_000, 150_000));

    }
    
}
