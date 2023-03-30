package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> setLessons = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            setLessons.addAll(entry.getValue());
        }
        return setLessons;

    }

    public static void main(String[] args) {
        Map<String, List<String>> timetable = new HashMap<>();
        timetable.put("Monday", Arrays.asList("English"));
        timetable.put("Tuesday", Arrays.asList("Mathematics"));
        timetable.put("Wednesday", Arrays.asList("English", "Chemistry"));
        timetable.put("Thursday", Arrays.asList("Literature", "Mathematics"));
        timetable.put("Friday", Arrays.asList("Physics"));
        LessonsGetter getter = new LessonsGetter();
        Set<String> allLessons = getter.getLessons(timetable);
        System.out.println(allLessons);
    }
}
