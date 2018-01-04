package ru.schepin.calculator1;

import java.util.List;

public interface Command {
    void execute/*выполнение*/(List<String> arguments, CalculatorContext context);


}
