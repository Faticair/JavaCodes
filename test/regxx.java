import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regxx {
    String pattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
    Pattern regx = Pattern.compile(pattern);

    public boolean match(String inputs) {
        return Pattern.matches(pattern, inputs);
    }

    public boolean matchup(String inputs) {
        Matcher matcher = regx.matcher(inputs);
        return matcher.find();
    }

    public void matchstring(String inputs) {
        Matcher matcher = regx.matcher(inputs);
        while (matcher.find()) {
            System.out.println(matcher.toString());
            System.out.println(matcher.group(0));
            }
        }
    
    public void matchends(String inputs) {
        Matcher matcher = regx.matcher(inputs);
        while (matcher.find()) {
            System.out.println("Start: " + matcher.start());
            System.out.println("End: " + matcher.end());
        }
    }

}
