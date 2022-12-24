package Seminar3.service;

import Seminar3.data.User;
import Seminar3.util.ReaderToTxt;
import Seminar3.util.WriteToTxt;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) {
        WriteToTxt.write(user);        
    }

    @Override
    public User read(User user) {
       return ReaderToTxt.read(user);        
    }    
}
