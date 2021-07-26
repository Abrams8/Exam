package com.company;

import com.company.comporators.AlcoSpirtPersentegeComparator;
import com.company.model.Alcogol;
import com.company.model.Cognac;
import com.company.model.Vine;
import com.company.model.enums.VineColor;
import com.company.model.enums.VineType;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Alcogol> alcoList = new ArrayList<>();
        alcoList.add(new Vine("Malinos", 0.7, 12.5, "Spain", 13, 2020, VineColor.RED, VineType.SEMIDRY));
        alcoList.add(new Cognac("Kolhida", 0.5, 45, "George", 25, 2015));
        alcoList.add(new Cognac("Telavi", 0.5, 45, "George", 20, 2016));
        alcoList.add(new Alcogol("Jorjey", 0.7, 45, "Germany", 11));
        alcoList.add(new Vine("TytiPryti", 0.7, 11.5, "France", 10, 2018, VineColor.WHITE, VineType.DRY));
        showCollection(alcoList);
        System.out.println("-----------");
        alcoList.stream()
                .sorted(new AlcoSpirtPersentegeComparator()
                        .thenComparing(Comparator.comparing(Alcogol::getPrice)))
                .forEach(System.out::println);

        Map<Double, List<Alcogol>> map = new HashMap<>();
        for (Alcogol alcogol : alcoList) {
            List<Alcogol> volumeAlcoList = map.get(alcogol.getVolume());
            if (volumeAlcoList == null) {
                volumeAlcoList = new ArrayList<>();
            }
            volumeAlcoList.add(alcogol);
            map.put(alcogol.getVolume(), volumeAlcoList);
        }
        map.entrySet().stream().forEach(System.out::println);

    }

    public static void showCollection(List<Alcogol> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
