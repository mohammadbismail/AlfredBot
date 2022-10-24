public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Ahmad");
        String testAnnouncements = alfredBot.dateAnnounced();
        String alexisTest = alfredBot.respondBeforeAlexis("  , play some low-fi Alexis beats");
        String anotherTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String oneMoreTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");

        // System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testAnnouncements);
        // System.out.println(alexisTest);
        // System.out.println(anotherTest);
        // System.out.println(oneMoreTest);
    }
}
