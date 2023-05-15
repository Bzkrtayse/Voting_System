/*aysebzkrt47
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

/**
 *
 * @author ÖMER
 */
public class Turkish extends Person {

    public Turkish(String name, int age, String Pid) {
        super(name, age, Pid);
    }

    /*The protected modifier specifies that
    the member can only be accessed within its own package
    We just use a relationship between base class and derived class for overriding
    n our case both Turkish and foreign are derived from person
    So if we are able to represent it through generalization It is enough
     */
    @Override
    protected boolean isEligibleToVote() {
        return (getAge() >= 18 && isValidId(getPid()));
    }

    private boolean isValidId(String id) {
        return (id.length() == 11 && id.matches("\\d{11}"));
    }
}
