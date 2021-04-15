package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.example", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDisinfector coronaDisinfector = context.getObject(CoronaDisinfector.class);
        coronaDisinfector.start(new Room());
    }
}
