//package AppointmentBooking.ValidateDetails;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;   
public class ValidateEmail
{ 
    public static boolean isValidEmail(String email) 
    {           
        Pattern patternEmail = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+ "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$"); 
        return patternEmail.matcher(email).matches(); 
    } 
     
} 