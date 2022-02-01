package com.modelsisspringbootfullstack.service;

import com.modelsisspringbootfullstack.entities.AppRole;
import com.modelsisspringbootfullstack.entities.AppUser;
import com.modelsisspringbootfullstack.entities.ProductType;

public interface AccountService {
    public AppUser saveUser(String username, String password, String confirmedPassword);
    public AppRole saveRole(AppRole role);
    public AppUser loadUserByUsername(String username);
    public void addRoleToUser(String username,String rolename);
//    public Task saveTask(String taskname, Long user_id);
}
