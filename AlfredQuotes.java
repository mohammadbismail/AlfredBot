import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    Date myDate = new Date();
    SimpleDateFormat myFormat = new SimpleDateFormat("HH");
    String timeOnlyFormatStr = myFormat.format(myDate);
    int timeOnlyFormatInt = Integer.parseInt(timeOnlyFormatStr);

    public String basicGreeting() {
        return "Hello, lovely to see you, How are you!";
    }

    public String guestGreeting(String name) {
        if ( timeOnlyFormatInt < 12) {
            String formatName = String.format("Good Morning %s, its lovely to see you", name);
            return formatName;
        }
        else if (timeOnlyFormatInt > 12 && timeOnlyFormatInt < 2) {
            String formatName = String.format("Good Afternoon %s, its lovely to see you", name);
            return formatName;
        }
        else {
            String formatName = String.format("Good Evening %s, its lovely to see you", name);
            return formatName;
        }
    }

    public String dateAnnounced() {
        return "Its currently " + myDate;
        // return "Its currently " + timeOnlyFormatStr;
    }

    public String respondBeforeAlexis(String converstation) {
        int alfredName = converstation.indexOf("Alfred");
        int alexisName = converstation.indexOf("Alexis");
        if (alexisName >= 0) {
            return "Right Away Sir";
        } else if (alfredName >= 0) {
            return "As you wish";
        } else {
            return "Right, and with that I shall retire!";
        }
    }
}
