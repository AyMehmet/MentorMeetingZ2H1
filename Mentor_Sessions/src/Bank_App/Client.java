package Bank_App;

public class Client {
    int Client_id;
    String firstName;
    String lastName;
    String gender;

    public Client(int client_id, String firstName, String lastName, String gender) {
        Client_id = client_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
