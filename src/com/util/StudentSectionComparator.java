package com.util;

import java.util.Comparator;

public class StudentSectionComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o1.getSection().compareTo(o2.getSection());
    }
}
