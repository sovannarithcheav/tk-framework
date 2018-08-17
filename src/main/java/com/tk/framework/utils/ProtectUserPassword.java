package com.tk.framework.utils;

/**
 * Created by sovannarith on 8/17/18
 */
public class ProtectUserPassword {

    public static void main(String[] args) {
        String myPassword = "1234";

        // Generate Salt. The generated value can be stored in DB.
        String salt = PasswordUtils.getSalt(30);

        // Protect user's password. The generated value can be stored in DB.
        String mySecurePassword = PasswordUtils.generateSecurePassword(myPassword, salt);

        // Print out protected password
        System.out.println("My secure password = " + mySecurePassword);
        System.out.println("Salt value = " + salt);
    }

}
