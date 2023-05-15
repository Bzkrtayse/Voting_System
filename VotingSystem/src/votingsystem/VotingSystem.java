/*ayse bzkrt
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

import java.util.*;

/**
 *
 * @author ÖMER
 */
public class VotingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String Pid, Psprt_id;

        Party[] parties = new Party[3];
        parties[0] = new Party("AKP", 0);
        parties[1] = new Party("CHP", 1);
        parties[2] = new Party("ZP", 2);

        Person[] allPersons = new Person[5];
        System.out.println("1. Citizen:");
        System.out.println("Enter The Id : ");
        Pid = scan.nextLine();
        allPersons[0] = new Turkish("Omer", 27, Pid);

        allPersons[0].vote(1, parties);

        System.out.println("2. Citizen:");
        System.out.println("Enter The Id : ");
        Pid = scan.nextLine();
        allPersons[1] = new Turkish("İlker", 15, Pid);
        allPersons[1].vote(0, parties);

        System.out.println("3. Citizen:");
        System.out.println("Enter The Id : ");
        Pid = scan.nextLine();
        System.out.println("Enter Passport Number");
        Psprt_id = scan.nextLine();
        allPersons[2] = new Foreign("Bob", 23, Psprt_id, Pid);
        allPersons[2].vote(2, parties);

        System.out.println("4. Citizen:");
        System.out.println("Enter The Id : ");

        Pid = scan.nextLine();
        System.out.println("Enter Passport Number");
        Psprt_id = scan.nextLine();
        allPersons[3] = new Foreign("Alice", 23, Psprt_id, Pid);

        System.out.println("5. Citizen:");
        System.out.println("Enter The Id : ");
        Pid = scan.nextLine();
        allPersons[4] = new Turkish("Hazal", 25, Pid);
        allPersons[4].vote(1, parties);

        System.out.println("---------------------------------------");
        displayPartiesVotes(parties);
        System.out.println("---------------------------------------");
        displayPersonAll(allPersons);
        scan.close();
    }

    public static void displayPartiesVotes(Party[] parties) {
        System.out.println("Party Votes:\n ");
        for (Party party : parties) {
            System.out.println("Party: " + party.getName() + ", ID: " + party.getPartyId()
                    + ", Votes: " + party.getTotalVotes());
        }
    }

    public static void displayPersonAll(Person[] personAll) {
        for (Person person : personAll) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge()
                    + ", Voted: " + person.hasVoted());
        }
    }
}
