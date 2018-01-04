package ru.schepin.otherExercises.Exception;

public class Test {
    public void doIt() throws Exception {
        throw new Exception("doIt");
    }

    public void doAnother() throws Exception {
        doIt();
    }

    public void letsDoIt() throws Exception {
        try {
            doAnother();
        } catch (Exception e) {
            System.out.println("first printStackTrace:");
            e.printStackTrace(System.out);
            System.out.println("local context in catch:");
            Throwable t = new Throwable();
            t.fillInStackTrace();
            t.printStackTrace(System.out);
            System.out.println("Throw it again...");
            throw e;
        }
    }
}
