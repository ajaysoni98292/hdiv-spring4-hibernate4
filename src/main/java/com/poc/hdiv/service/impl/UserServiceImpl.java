package com.poc.hdiv.service.impl;

import com.poc.hdiv.persistence.dao.UserDao;
import com.poc.hdiv.persistence.dao.common.IOperations;
import com.poc.hdiv.persistence.model.User;
import com.poc.hdiv.service.UserService;
import com.poc.hdiv.service.common.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ajay
 */
@Service
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    protected IOperations<User> getDao() {
        return userDao;
    }
}
