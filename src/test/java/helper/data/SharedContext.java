package helper.data;


public class SharedContext {
    private static UserData userData;

    public static void setUserData(UserData data) {
        userData = data;
    }

    public static String getUsername() {
        return userData.getUsername();
    }

    public static String getPassword() {
        return userData.getPassword();
    }

    public static String getFullname() {
        return userData.getFirstName() + " " + userData.getLastName();
    }
}


