package com.tk.framework.utils;

/**
 * Created by sovannarith on 8/17/18
 */
public class VerifyProvidedPassword {


    public static void main(String[] args) {
        // User provided password to validate
        String providedPassword = "12345";

        // Encrypted and Base64 encoded password read from database
        String securePassword = "vVxRgC3YUuYWU539kCzR5vnXQjDrqauA7JfQ6gxD0VY=";

        // Salt value stored in database
        String salt = "ZkL0lmMLgIwwwViYk9pWa7sK6J1Sv5";

        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);

        if (passwordMatch) {
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            System.out.println("Provided password is incorrect");
        }
    }

}
