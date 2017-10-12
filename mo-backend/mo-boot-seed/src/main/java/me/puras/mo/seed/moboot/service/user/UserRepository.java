package me.puras.mo.seed.moboot.service.user;

import me.puras.mo.seed.moboot.domain.User;
import me.puras.common.persistence.CrudRepository;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author <a href="mailto:he@puras.me">puras</a>
 * @version $Revision 1.0 $
 * Created On 2017-08-02 11:15
 */
@Mapper
public interface UserRepository extends CrudRepository<User> {
}
