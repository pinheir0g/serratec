package br.org.serratec.academia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.org.serratec.academia.entities.User;
import br.org.serratec.academia.entities.UserDetailImpl;
import br.org.serratec.academia.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
    		throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username)
        		.orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
        return new UserDetailImpl(user);
    }
}
