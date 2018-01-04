package ru.schepin.otherExercises.shape;

public class Rectangle extends Shape {
    private String style;


    public Rectangle(String style, int height, int width) {
        this.style = style;
        setHeight(height);
        setWidth(width);
    }


    public String getStyle() {
        return "Cтиль: " + style;
    }

    public String analyze() {
        return String.format("%s, Ширина=%d, Высота=%d, Площадь = %d", getStyle(), getWidth(), getHeight(), getArea());
    }

    public void print() {
        System.out.println(analyze());
    }
}
