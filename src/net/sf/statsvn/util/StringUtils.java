package net.sf.statsvn.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    /**
     * This method is a 1.4 replacement of the String.replace(CharSequence, CharSequence) found in 1.5.
     * @param originalPattern
     * @param newPattern
     * @param originalString
     * @return
     */
    public static String replace(final String originalPattern, final String newPattern, final String originalString) {
        if ((originalPattern == null) || (originalPattern.length() == 0) || (originalString == null)) {
            return originalString;
        }

        return Pattern.compile(originalPattern , Pattern.LITERAL).matcher(
        		originalString).replaceAll(Matcher.quoteReplacement(newPattern));
    }
}
