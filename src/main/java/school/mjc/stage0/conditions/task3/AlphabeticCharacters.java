package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String result = !Character.isLetter(character) ? "Wrong alphabet!" :
                "AEIOUaeiou".indexOf(character) != -1 ? "Vowel" : "Consonant";
        System.out.println(result);
    }
}
