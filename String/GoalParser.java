package com.priyanshu.String;

public class GoalParser {
    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
    static String interpret(String command) {
        String goal = command.replace("()","o");
        goal = goal.replace("(al)","al");
        return goal;

    }
}
