package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiService;
import com.openclassrooms.magicgithub.model.User;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers();
        // return = retourner a la méthode appelante
    }

    public void generateRandomUser() {
apiService.generateRandomUser();
    }


    public void deleteUser(User user) {
apiService.deleteUser(user);
    }

}