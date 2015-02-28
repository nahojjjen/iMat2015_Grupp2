/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imat;

import static imat.Model.data;
import se.chalmers.ait.dat215.project.CreditCard;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.User;

/**
 *
 * @author Viktor
 */
public class CustomerModel {

    //User and customer instance
    public static User user = new User();
    public static Customer customer = data.getCustomer();
    public static CreditCard creditCard = data.getCreditCard();

    /**
     * returns the current user
     *
     * @return User
     */
    public static User getUser() {
        return data.getUser();
    }

    /**
     * get the password of user
     *
     * @return a string of the current password.
     */
    public static String getPassword() {
        String password = "";
        try {
            password = user.getPassword();
        } catch (NullPointerException e) {
        } finally {
            return password;
        }
    }

    //todo
    public static boolean isPaymentFilledIn(){
    
        
        
        return true;
    }
    /**
     * get the first name of the user
     *
     * @return a string of the users first name
     */
    public static String getFirstName() {
        String firstName = "";
        try {
            firstName = customer.getFirstName();
            return firstName;
        } catch (NullPointerException e) {
            return firstName;
        }
    }

    /**
     * get the last name of the user
     *
     * @return a string of the users last name
     */
    public static String getLastName() {
        String lastName = "";
        try {
            lastName = customer.getLastName();
            return lastName;
        } catch (NullPointerException e) {
            return lastName;
        }
    }

    /**
     * get the post code of the user
     *
     * @return a string of the users post code
     */
    public static String getPostCode() {
        String postCode = "";
        try {
            postCode = customer.getPostCode();
            return postCode;
        } catch (NullPointerException e) {
            return postCode;
        }
    }

    /**
     * get the post address of the user
     *
     * @return a string of the users post address
     */
    public static String getPostAddress() {
        String postAddress = "";
        try {
            postAddress = customer.getPostAddress();
            return postAddress;
        } catch (NullPointerException e) {
            return postAddress;
        }
    }

    /**
     * get the address of the user
     *
     * @return a string of the users address
     */
    public static String getAddress() {
        String address = "";
        try {
            address = customer.getAddress();
            return address;
        } catch (NullPointerException e) {
            return address;
        }
    }

    /**
     * get the phone number of the user
     *
     * @return a string of the users phone number
     */
    public static String getPhoneNumber() {
        String phoneNumber = "";
        try {
            phoneNumber = customer.getPhoneNumber();
            return phoneNumber;
        } catch (NullPointerException e) {
            return phoneNumber;
        }
    }

    /**
     * get the email of the user
     *
     * @return a string of the users email address
     */
    public static String getEmail() {
        String email = "";
        try {
            email = customer.getEmail();
            return email;
        } catch (NullPointerException e) {
            return email;
        }
    }

    /**
     * set the password of the user
     *
     * @param input the string the username should be
     */
    public static void setPassword(String input) {
        user.setPassword(input);
    }

    public static void setEmail(String input) {
        customer.setEmail(input);
    }

    public static void setFirstName(String input) {
        customer.setFirstName(input);
    }

    public static void setLastName(String input) {
        customer.setLastName(input);
    }

    public static void setAddress(String input) {
        customer.setAddress(input);
    }

    public static void setPostCode(String input) {
        customer.setPostCode(input);
    }

    public static void setPostAddress(String input) {
        customer.setPostAddress(input);
    }

    public static void setPhoneNumber(String input) {
        customer.setPhoneNumber(input);
    }

    public static void setCardNumber(String input) {
        creditCard.setCardNumber(input);
    }

    public static void setCardHolderName(String input) {
        creditCard.setHoldersName(input);
    }

    public static void setCardType(String input) {
        creditCard.setCardType(input);
    }

    public static void setCardMonth(int input) {
        creditCard.setValidMonth(input);
    }

    public static void setCardYear(int input) {
        creditCard.setValidYear(input);
    }

    public static void setCardVerification(int input) {
        creditCard.setVerificationCode(input);
    }

    public static String getCardType() {
        String cardType = "";
        try {
            cardType = creditCard.getCardType();
        } catch (NullPointerException e) {
        } finally {
            return cardType;
        }
    }

    public static String getCardHolderName() {
        String cardHolder = "";
        try {
            cardHolder = creditCard.getHoldersName();
        } catch (NullPointerException e) {
        } finally {
            return cardHolder;
        }
    }

    public static String getCardNumber() {
        String cardNumber = "";
        try {
            cardNumber = creditCard.getCardNumber();
        } catch (NullPointerException e) {
        } finally {
            return cardNumber;
        }
    }

    public static int getCardMonth() {
        int cardMonth = 0;
        try {
            cardMonth = creditCard.getValidMonth();
            if (cardMonth > 11) {
                cardMonth = 0;
            }
        } catch (NullPointerException e) {
        } finally {
            return cardMonth;
        }
    }

    public static int getCardYear() {
        int cardYear = 0;
        try {
            cardYear = creditCard.getValidYear();
            if (cardYear > 8) {
                cardYear = 0;
            }
        } catch (NullPointerException e) {
        } finally {
            return cardYear;
        }
    }

    public static int getCardVerification() {
        int cardVerification = 0;
        try {
            cardVerification = creditCard.getVerificationCode();
        } catch (NullPointerException e) {
        } finally {
            return cardVerification;
        }
    }

    public static boolean cardNumberTest(String str) {
        String cardType = getCardType();
        return (cardType.equals("American Express") && str.length() == 19
                || cardType.equals("VISA/MasterCard") && str.length() == 21);
    }

    public static boolean cardHolderNameTest(String str) {
        return testAlphabeticalString(str);

    }

    public static boolean cardVerificationTest(String str) {
        return (str.length() == 3);
    }

    public static boolean firstNameTest(String str) {
        return testAlphabeticalString(str);
    }

    public static boolean lastNameTest(String str) {
        return testAlphabeticalString(str);
    }

    public static boolean addressTest(String str) {
        return testAlphabeticalString(str);
    }

    /**
     * currently only checks if password is longer than 3 characters
     *
     * @param str input text
     * @return true if str.lenght > 3
     */
    public static boolean passwordTest(String str) {
        return (str.length() > 3);
    }

    public static boolean postCodeTest(String str) {
        return (str.length() == 6);
    }

    public static boolean postAddressTest(String str) {
        return testAlphabeticalString(str);
    }

    public static boolean phoneNumberTest(String str) {
        return (str.length() > 8);
    }

    /**
     * I could not get this to work on any of my real emails using new method
     * meanwhile
     *
     * @param str
     * @return true if something, unknown
     */
    public static boolean emailTest(String str) {
        if (str.contains("@") && str.contains(".") && str.length() > 6) {
            return true;
        }
        return false;

    }

    /**
     *
     * @param str
     * @return true if string only contains letters a-Z
     */
    public static boolean testAlphabeticalString(String str) {
        return (str.matches("[a-zA-Z]+") && str.length() > 1);
    }

}
