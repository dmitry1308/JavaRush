package ru.schepin.calculator1.commands;


import ru.schepin.calculator1.CalculatorContext;
import ru.schepin.calculator1.Command;

import java.util.List;

public class SubtractionCommand implements Command {
    @Override
    public void execute(List<String> arguments, CalculatorContext context) {
        if (context.size() >= 2) {
            context.push(context.pop() - context.pop());
        } else if (context.size() == 1) {
            System.out.println("Необходим еще один аргумент");
        } else {
            System.out.println("Стек пустой");
        }
    }
}
