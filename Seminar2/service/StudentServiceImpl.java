package seminar2.service;

import seminar2.util.ReaderFromTXT;
import seminar2.util.WriterToTxt;
import seminar2.data.User;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) {
        WriterToTxt.write(user);
        
    }

    @Override
    public User read(User user) {
        return ReaderFromTXT.read(user);
        
    }
    
}
