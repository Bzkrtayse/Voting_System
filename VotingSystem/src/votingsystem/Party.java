/*aysebzkrt
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

/**
 *
 * @author ÖMER
 */
public class Party {

    private int partyId;
    private String name;
    private int totalVotes;

    public Party(String name, int partyId) {
        this.partyId = partyId;
        this.name = name;
        this.totalVotes = 0;
    }

    public int getPartyId() {
        return partyId;
    }

    public String getName() {
        return name;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void increaseVote() {

        totalVotes++;

    }
}
