package com.practise.practise.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

@Document(collection = "users")
public class User implements UserDetails{

    @Id
    private String userId;
    private String username;
    private String password;
    private String email;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        return null;
    };

    @Override
    public String getPassword(){
        return this.password;
    }
    
}
