package com.poc.hdiv.persistence.dao.impl;

import com.poc.hdiv.persistence.dao.UserDao;
import com.poc.hdiv.persistence.dao.common.AbstractDao;
import com.poc.hdiv.persistence.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ajay
 */
@Repository
public class UserDaoImpl extends AbstractDao<User> implements UserDao {

    public UserDaoImpl() {
        super();
        setClazz(User.class);
    }
}
