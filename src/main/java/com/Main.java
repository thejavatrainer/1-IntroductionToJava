package com;

import com.frequentis.ps.conversation.contract.ConversationServiceCode;

public class Main {
    public static void main(String[] args) {
        PhoneBookEntry entry = new PhoneBookEntry();
        entry.name ="John";
        entry.telephoneNumber ="0232432";

        System.out.println("Hello from my app: " + ConversationServiceCode.COMMUNICATION_CATEGORY_DOES_NOT_EXIST);
    }

    public String doSomething() {
        return "Andreea";
    }

    public void doSomethingElse() {
    }
}


