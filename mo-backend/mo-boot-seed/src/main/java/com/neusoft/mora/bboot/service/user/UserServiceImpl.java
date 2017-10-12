package com.neusoft.mora.bboot.service.user;

import com.neusoft.mora.bboot.domain.User;
import me.puras.common.persistence.CrudRepository;
import me.puras.common.service.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author <a href="mailto:hegq@neusoft.com">puras</a>
 * @version $Revision 1.0 $
 * Created On 2017-08-02 11:23
 */
@Service
@Transactional
public class UserServiceImpl extends CrudServiceImpl<User> implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public CrudRepository<User> getRepository() {
        return repository;
    }
}
