package ru.schepin.calculator1.commands;


import ru.schepin.calculator1.CalculatorContext;
import ru.schepin.calculator1.Command;

import java.util.List;

public class PrintCommand implements Command {

    @Override
    public void execute(List<String> arguments, CalculatorContext context) {
        float value = context.peek();
        System.out.println(value);
    }
}
