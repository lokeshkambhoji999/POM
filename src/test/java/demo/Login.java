package demo;

import org.testng.annotations.Test;

public class Login {

@Test

public void loginTest() {

System.out.println("Login successful");

}

@Test(priority = 0)

public void registerTest() {

System.out.println("Register successful");

}

@Test(priority = -1)

public void sendEmail() {

System.out.println("Sent email successfully");

}

@Test(priority = 1)

public void checkCalendar() {

System.out.println("Calendar checked successfully");

}

@Test

public void meetUp() {

System.out.println("Zoom Meet successful");

}

@Test(priority = 1)

public void logoutTest() {

System.out.println("Logout successful");

}

}