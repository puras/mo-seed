package me.puras.mo.seed.moboot.domain;

import me.puras.common.domain.DomainModel;

/**
 * @author <a href="mailto:he@puras.me">puras</a>
 * @version $Revision 1.0 $
 * Created On 2017-08-02 11:13
 */
public class User extends DomainModel {
    private String name;

    @Override
    public String toString() {
        return super.toString() + "User{" +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
