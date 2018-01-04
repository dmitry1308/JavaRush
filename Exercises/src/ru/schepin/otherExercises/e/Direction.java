package ru.schepin.otherExercises.e;


public enum Direction {
    FORWARD(1.0) {
        public Direction opposite() {
            return BACKWARD;
        }
    },
    BACKWARD(2.0) {
        public Direction opposite() {
            return FORWARD;
        }
    };
    private double ratio;

    Direction(double r) {
        ratio = r;
    }

    public double getRatio() {
        return ratio;
    }

    public static Direction byRatio(double r) {
        if (r == 1.0) return FORWARD;
        else if (r == 2.0) return BACKWARD;
        else throw new IllegalArgumentException("Unknown ratio.");
    }


    public static void main(String[] args) {
        Direction direction = Direction.byRatio(1);
        double ratio = direction.getRatio();

    }
}

