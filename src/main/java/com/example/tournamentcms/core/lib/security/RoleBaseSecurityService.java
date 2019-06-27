package com.example.tournamentcms.core.lib.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("roleBaseSecurityService")
public class RoleBaseSecurityService {

    @Autowired UserRepository userRepository;

}
