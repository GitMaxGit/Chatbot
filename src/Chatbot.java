import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        Database database = new Database();
        int requestedId = 0;
        Scanner in = new Scanner(System.in);
        //getRequest
        int id = 0;
        System.out.println("Hello, welcome to HospiBot.");
        System.out.println("What's your relatives patient ID?");
        //ID = input
        id = in.nextInt();
        while (!database.getPatients().containsKey(id)) {
            System.out.println("This ID doesnt't exist, please try again.");
            id = in.nextInt();
        }
        System.out.println(database.getPatients().get(id).getName() + " is currently in the hospital.\n" +
                "How can I help you?\n" +
                "You can write: \"Status\" to get the patients status or \"Room\" and I will give you their room number.");
        in = new Scanner(System.in);
        String request = in.nextLine();
        while (!(request.equals("status") || request.equals("room"))){
            System.out.println("Sorry, I don't know this request, please try again.");
            request = in.nextLine();
        }
        switch (request) {
            case "status" -> System.out.println(database.getPatients().get(requestedId).getName() + "'s status is: " + database.getPatients().get(requestedId).getStatus());
            case "room" -> System.out.println(database.getPatients().get(requestedId).getName() + "'s room is: " + database.getPatients().get(requestedId).getRoom());
        }

    }
}
