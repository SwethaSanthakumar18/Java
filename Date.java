import java.time.*; 
import java.time.format.DateTimeFormatter;  
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;  
public class Date { 
public static void LocalDateTimeApi() 
{ 
    LocalDate date = LocalDate.now(); 
    System.out.println("Current date :"+ date); 
    LocalTime time = LocalTime.now(); 
    System.out.println("Current Time :"+ time); 
    LocalDateTime current = LocalDateTime.now(); 
    System.out.println("Current date and time : "+current); 
    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
    String formatedDateTime = current.format(format);   
    System.out.println("Formatted Date and Time"+ formatedDateTime); 
    Month month = current.getMonth(); 
    int day = current.getDayOfMonth(); 
    int seconds = current.getSecond(); 
    System.out.println("Month : "+month+" day : "+ day+" seconds : "+seconds); 
    ZonedDateTime currentZone = ZonedDateTime.now();  
    System.out.println("The current zone is :" +currentZone.getZone());  
    LocalDate date1 =  LocalDate.of(2000, Month.FEBRUARY, 16); 
        Period gap = Period.between(date1, date); 
        System.out.println("Gap between both the dates "+ "is a period of "+gap);
Duration fiveHours = Duration.ofHours(5); 
        LocalTime time2 = time.plus(fiveHours); 
        System.out.println("After adding five hours " + "of duration " + time2); 
        Duration gap1 = Duration.between(time2, time); 
        System.out.println("Duration gap between time1" + " & time2 is " + gap1); 
    LocalDate year =  date.plus(2, ChronoUnit.YEARS);
    LocalDate dayOfNextMonth =  date.with(TemporalAdjusters.firstDayOfNextMonth()); 
    System.out.println("First Day Of Next Month : " + dayOfNextMonth );  
    System.out.println("The result is :" + year); 
} 
    public static void main(String[] args)  
    { 
        LocalDateTimeApi(); 
    } 
} 