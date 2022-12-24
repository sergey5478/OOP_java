package seminar2.service;

import seminar2.data.User;

public interface DataService {
    
    void create(User user);

    User read(User user);

}
