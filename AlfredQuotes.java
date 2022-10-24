import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you, How are you!";
    }

    public String guestGreeting(String name) {
        String formatName = String.format("Hi %s, its lovely to see you", name);
        return formatName;
    }

    public String dateAnnounced() {
        Date date = new Date();
        return "Its currently " + date;
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
