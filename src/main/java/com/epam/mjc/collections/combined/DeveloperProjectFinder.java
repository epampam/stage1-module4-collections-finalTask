package com.epam.mjc.collections.combined;

import java.util.*;
import java.util.stream.Collectors;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        return projects.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(developer))
                .map(Map.Entry::getKey)
                .sorted(Comparator.comparingInt(String::length)
                        .reversed()
                        .thenComparing(Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }


}
