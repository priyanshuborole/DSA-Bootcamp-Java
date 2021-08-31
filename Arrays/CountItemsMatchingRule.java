package com.priyanshu.Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        String a;
        int count = 0;
        switch (ruleKey){
            case "type" -> {
                for (int i = 0; i < items.size(); i++){
                    a = items.get(i).get(0);
                    if (a.equalsIgnoreCase(ruleValue)){
                        count++;
                    }
                }
                return count;
            }case "color" -> {
                for (int i = 0; i < items.size(); i++){
                    a = items.get(i).get(1);
                    if (a.equalsIgnoreCase(ruleValue)){
                        count++;
                    }
                }
                return count;
            }
            case "name" -> {
                for (int i = 0; i < items.size(); i++){
                    a = items.get(i).get(2);
                    if (a.equalsIgnoreCase(ruleValue)){
                        count++;
                    }
                }
                return count;
            }
            default -> {
                System.out.println("Invalid rule key");
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        List<String> item = new ArrayList<>();

    }
}