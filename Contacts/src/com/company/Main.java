package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        ContactManager myContactManager = new ContactManager();

        Contact newFriend = new Contact();
        newFriend.name = "Opelowa Idado";
        newFriend.email = "myfriendsemail@gmail.com";
        newFriend.phoneNumber = "090903929384";
        myContactManager.addContact(newFriend);

        Contact starp = new Contact();
        starp.phoneNumber = "090928392839";
        starp.email = "starp@gmail.com";
        starp.name = "Godwin";
        myContactManager.addContact(starp);

        Contact titi = new Contact();
        titi.name ="Titilayo";
        titi.email = "titilayo@yahoo.com";
        titi.phoneNumber = "080307594859";
        myContactManager.addContact(titi);

        Contact searchName = myContactManager.searchContacts("Titilayo");

        System.out.println(searchName.email);

    }
}
