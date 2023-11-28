package chapter12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static chapter12.TestResults.getMakeUpGrades;
import static chapter12.TestResults.getOriginalGrades;

public class NewGrades {

    public static void main(String[] args) {

        Map <String, Integer> oldGrades = getOriginalGrades();
        Map <String, Integer> newGrades = getMakeUpGrades();
        for (var entry : newGrades.entrySet()){
            var oldGrade = oldGrades.get(entry.getKey());
            var newGrade = newGrades.get(entry.getKey());
            if (newGrade > oldGrade)
                oldGrades.put(entry.getKey(), newGrade);
            System.out.println(entry.getKey() + " " + oldGrades.get(entry.getKey()));

        }
    }


}
