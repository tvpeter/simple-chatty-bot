package com.company;

public class ContactManager {

    Contact [] myFriends;

    int myFriendsCount;

    ContactManager()
    {
        myFriends = new Contact[500];

        myFriendsCount = 0;
    }

    void addContact(Contact contact)
    {
        myFriends[myFriendsCount] = contact;

        myFriendsCount++;
    }

    Contact searchContacts(String searchName)
    {
        for (int i=0; i<myFriendsCount; i++) {
            if(myFriends[i].name.equals(searchName))
            {
                return myFriends[i];
            }
        }
        return null;
    }
}
