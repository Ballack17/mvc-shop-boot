package ru.geekbrains.persistance;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class User {

    private Integer id;

    @NotBlank
    private String login;

    @Email
    private String email;

    private String password;

    private String matchingPassword;

    public User() {
    }

    public User(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
