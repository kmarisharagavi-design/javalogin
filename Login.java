public class Login {

    public static void main(String[] args) {

      String username="admin";
        String password = "12345";

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
