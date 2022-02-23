package com.amigoscode.awsspringreact.datastore;

import com.amigoscode.awsspringreact.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("14cff274-9432-11ec-b909-0242ac120002"), "SaraM", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("1e74a31a-9432-11ec-b909-0242ac120002"), "BorjanB",null));
    }

    public List<UserProfile> getUserProfiles (){
        return USER_PROFILES;
    }
}
