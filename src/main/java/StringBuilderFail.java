/**
 * @author aakoch
 * @since 6/22/2016
 */
public class StringBuilderFail {
    public static void main(String[] args) {
        String stringVariable = "string variable";
        String calls = "calls";

        StringBuilder sb = new StringBuilder();
        sb.append("a string literal plus a " + stringVariable + " should be concatenated using separate ")
                .append(calls).append("and " + "not " + "like " + "this");

        // when compiled, the code looks like:
        sb.append("a string literal plus a " + stringVariable + " should be concatenated using separate ")
              .append(calls).append("and not like this");
    }
}
