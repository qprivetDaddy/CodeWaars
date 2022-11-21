/**
 * Наша футбольная команда завершила чемпионат.
 * Результаты матчей нашей команды записываются в виде набора строк. Каждый матч представлен строкой в формате"x:y", где x- счет нашей команды и счетy соперника.
 * Например: ["3:1", "2:2", "0:1", ...]
 * Очки начисляются за каждое совпадение следующим образом:
 * если x> y: 3 очка (победа)
 * если x < y: 0 очков (проигрыш)
 * если x = y: 1 очко (ничья)
 * Нам нужно написать функцию, которая принимает эту коллекцию и возвращает количество очков, набранных нашей командой (x) в чемпионате по правилам, приведенным выше.
 * Примечания:
 * наша команда всегда играет 10 матчей в чемпионате
 * 0 <= x <= 4
 * 0 <= y <= 4
 **/

public class Main {
    public static void main(String[] args) {
        String[] games = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        int sum = points(games);
        System.out.println(sum);
    }

    public static int points(String[] games) {
        int sum = 0;
        for (int i = 0; i < games.length; i++) {
            String tempString = games[i];
            Integer x = Integer.valueOf(tempString.charAt(0));
            Integer y = Integer.valueOf(tempString.charAt(2));
            if (x > y) {
                sum = sum + 3;
            } else if (x == y) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}
