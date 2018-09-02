package com.qroom.dao.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails{
    @Id
    private Login login;
    @Column
    private List<GrantedAuthority> grantedAuthorityList;

    public User(String login, String password, List<GrantedAuthority> grantedAuthorityList) {
        this.login = new Login(login, password);
        this.grantedAuthorityList = grantedAuthorityList;
    }

    public User(Login login) {
        this.login = login;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorityList;
    }

    @Override
    public String getPassword() {
        return login.getPassword();
    }

    @Override
    public String getUsername() {
        return login.getLogin();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
