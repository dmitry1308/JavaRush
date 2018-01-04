package ru.schepin.calculator1.commands;


import ru.schepin.calculator1.CalculatorContext;
import ru.schepin.calculator1.Command;

import java.util.List;

public class PushCommand implements Command {

    @Override
    public void execute(List<String> arguments, CalculatorContext context) {
        if (arguments.isEmpty()) {
            throw new RuntimeException("PushCommand: No arguments");
        }
        String arg = arguments.get(0);
        //float value = Float.parseFloat(arg);
        float value;
        if (context.isValue(arg)) {
            value = context.getValue(arg);
        } else {
            value = Float.parseFloat(arg);
        }

        context.push(value);
    }
}
