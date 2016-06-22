/**
 * @author aakoch
 * @since 6/22/2016
 */
public class LogNThrow {

    public static void main(String[] args) {
        try {
            new LogNThrow().doSomething();
        }
        catch (RuntimeException e) {
            logError("Caught exception trying to call doSomething: " + e.getMessage(), e);
            throw e;
        }
    }

    private void doSomething() {
        try {
            doSomethingElse();
        }
        catch (RuntimeException e) {
            logError("Caught exception trying to call doSomethingElse: " + e.getMessage(), e);
            throw e;
        }
    }

    private void doSomethingElse() {
        try {
            doSomethingElseElse();
        }
        catch (RuntimeException e) {
            logError("Caught exception trying to call doSomethingElseElse: " + e.getMessage(), e);
            throw e;
        }
    }

    private void doSomethingElseElse() {
        throw new RuntimeException("I'm an exception!");
    }

    private static void logError(final String msg, final RuntimeException e) {
        System.err.println(msg);
        e.printStackTrace();
    }
}
