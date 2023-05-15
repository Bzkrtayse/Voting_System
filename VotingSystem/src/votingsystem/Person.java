//aysebzkrt
package votingsystem;

/*Since person class has very common members
name,age, person, id of both Foreign and Turkish classes,
I have declared person class as an abstract class.
So that I can declare common members.Extend it and use it
for their own purposes in Turkish and Foreign classes.
 */
abstract class Person {

    private String name;
    private int age;
    private boolean voted;
    private String Pid;

    public Person(String name, int age, String Pid) {
        this.name = name;
        this.age = age;
        this.Pid = Pid;
        this.voted = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPid() {
        return Pid;
    }

    public boolean hasVoted() {
        return voted;
    }

    public void vote(int partyId, Party[] parties) {
        if (!voted) {
            Party selectedParty = findPartyById(partyId, parties);
            if (selectedParty != null) {
                if (isEligibleToVote()) {
                    selectedParty.increaseVote();
                    voted = true;
                    System.out.println("Vote counted for Party: " + selectedParty.getName());
                } else {
                    System.out.println("Invalid vote for Party: " + selectedParty.getName());
                }
            } else {
                System.out.println("Invalid Party ID");
            }
        } else {
            System.out.println("Already voted");
        }
    }

    protected abstract boolean isEligibleToVote();

    private Party findPartyById(int partyId, Party[] parties) {
        for (Party party : parties) {
            if (party.getPartyId() == partyId) {
                return party;
            }
        }
        return null;
    }

}
