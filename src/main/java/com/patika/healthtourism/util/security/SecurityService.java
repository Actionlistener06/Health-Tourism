package com.patika.healthtourism.util.security;
import com.patika.healthtourism.database.entity.UserEntity;
import com.patika.healthtourism.database.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class SecurityService implements UserDetailsService {


    @Autowired
    UserEntityRepository userEntityRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<UserEntity> user = userEntityRepository.findByEmail(email);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Could not findUser with email =" + email);
        }

        return new User(email,
                user.get().getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
