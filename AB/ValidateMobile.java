import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateMobile
{
public static boolean isValidMobile(String mobile)
{
    Pattern patternMobile = Pattern.compile("(0/91)?[7-9][0-9]{9}");
    return patternMobile.matcher(mobile).matches(); 
}
}