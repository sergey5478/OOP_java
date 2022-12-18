package Seminar2.service;

import Seminar2.Util.ReaderFromTXT;
import Seminar2.Util.WriterToTxt;
import Seminar2.data.User;

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
