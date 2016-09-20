package com.ChatForum.ProfileModel;

import java.util.List;

public interface ProfileService {
	public void insertProfile(Profile p);
	public void deleteProfile(long p);
	public void updateProfile(Profile p);
	public Profile getProfile(String pusername);
    public List<Profile> getAllProfiles();
    
    public String updateFriendList(String myemail, String email);
}
