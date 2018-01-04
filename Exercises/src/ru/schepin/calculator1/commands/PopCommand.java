package ru.schepin.calculator1.commands;


import ru.schepin.calculator1.CalculatorContext;
import ru.schepin.calculator1.Command;

import java.util.List;

public class PopCommand implements Command {
    @Override
    public void execute(List<String> arguments, CalculatorContext context) {
//        if (context.isEmpty()) {
//            System.out.println("Стек пустой");
//        } else {
//            context.pop();
//        }
        float value = context.pop();
        String name = arguments.get(0);
        context.defineValue(name, value);
    }
}
