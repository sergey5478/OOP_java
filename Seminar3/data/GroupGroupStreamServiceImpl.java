package Seminar3.data;

import java.util.Collections;
import java.util.List;

import Seminar3.data.comparator.GroupStreamComparator;
import Seminar3.service.StudentStreamInterf;

public class GroupGroupStreamServiceImpl implements StudentStreamInterf{

    @Override
    public void groupStreamSort(List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
        
    }
    
}
