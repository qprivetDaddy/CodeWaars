import java.util.Arrays;

/**
 * У меня есть кошка и собака.
 * Я получил их одновременно с котенком / щенком. Это было humanYears(Человеческие годы) много лет назад.
 * Верните их соответствующие возрасты теперь как [humanYears,catYears,dogYears]
 * <p>
 * Примечания:
 * Человеческие годы >= 1
 * Человеческие годы - это только целые числа
 * <p>
 * Кошачьи годы
 * 15 кошачьи годы для первого года
 * +9 кошачьи годы на второй год
 * +4 кошачьи годы для каждого года после этого
 * <p>
 * Собачьи годы
 * 15 собачьи годы за первый год
 * +9 собачьи годы на второй год
 * +5 собачьи годы за каждый последующий год
 */

public class CatYearsDogYears {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(3)));
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) {
            return new int[]{1, 15, 15};
        } else if (humanYears == 2) {
            return new int[]{2, 24, 24};
        }
        return new int[]{humanYears, 24 + (humanYears - 2) * 4, 24 + (humanYears - 2) * 5};
    }
}

