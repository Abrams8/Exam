package com.company.comporators;

import com.company.model.Alcogol;

import java.util.Comparator;

public class AlcoSpirtPersentegeComparator implements Comparator<Alcogol>{
        @Override
        public int compare(Alcogol o1, Alcogol o2) {
            return (int)(o1.getSpirtPersentage() - o2.getSpirtPersentage());
        }
    }

