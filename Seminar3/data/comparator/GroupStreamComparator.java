package Seminar3.data.comparator;

import java.util.Comparator;

import Seminar3.data.GroupStream;

public class GroupStreamComparator implements Comparator<GroupStream>{

    @Override
    public int compare(GroupStream StudentGroup1, GroupStream StudentGroup2) {
        int sizeStudentGroup1 = StudentGroup1.getStudentGroup().size();
        int sizeStudentGroup2 = StudentGroup2.getStudentGroup().size();
        return Integer.compare(sizeStudentGroup1, sizeStudentGroup2);
    }
    
}
