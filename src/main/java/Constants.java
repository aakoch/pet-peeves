/**
 * @author aakoch
 * @since 6/22/2016
 */
public class Constants {

    // Bad names
    public static final String STRING_L = "L";

    public static final String STRING_E = "E";

    public static final String YES = "Yes";
    public static final String NO = "No";

    public static final String SIZE = "12";

    public static final String UN_KNOWN = "Unknown";

    public static final String R8 = "R8";

    // Good names
    public final static String CLIENT_ID = "cn=dwet999,ou=uprr,o=up,udi=wet2";
    public final static long XMF_SERVICE_TIMEOUT = 10000;
    public static final String HOME_PAGE_TXN_NAME = "Homepage";
    public static final String RELEASE_TXN_NAME = "Equipment Release";
    public static final String RELEASE_REJCT_TXN_NAME = "Equipment Reject";
    public static final String ORDERIN_TXN_NAME = "Equipment OrderIn";
    public static final String LOAD_MOVE_PENDED_BILLING_TXN_NAME = "Move Load Pended Bill";
    public static final String SWITCH_BILL_TXN_NAME = "Switch Bill";

    public enum PhoneConstants {
        COUNTRYCODE_SEPARATOR("."),
        EXTENSION_SEPARATOR("/"),
        COUNTRYCODE_PREFIX("+"),
        DEFAULT_REGIONCODE("US"),
        DEFAULT_COUNTRY_CODE("1"),
        CANADA_REGIONCODE("CA"),
        UNKNOWN_REGIONCODE("ZZ"),
        VALID_NUMBER_CHARACTERS("0123456789()-+ ");

        final String value;

        PhoneConstants(final String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

}
