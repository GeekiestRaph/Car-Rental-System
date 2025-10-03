import java.io.Console;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "password123";

        Console console = System.console();
        if (console == null) {
            System.out.println("No console available. Run in terminal/command prompt.");
            return;
        }

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            String username = console.readLine("Enter username: ");
            char[] passwordChars = console.readPassword("Enter password: ");
            String password = new String(passwordChars);

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("✅ Login successful! Welcome, " + username + "!");
                loggedIn = true;
                break;
            } else {
                System.out.println("❌ Incorrect username or password. Try again.");
                attempts++;
            }
        }

        if (!loggedIn) {
            System.out.println("🚫 Too many failed attempts. Exiting...");
        }
    }
}

