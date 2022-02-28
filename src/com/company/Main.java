package com.company;

public class Main {

    public static void main(String[] args) {
//        Days days = Days.DUISHOMBU;
//        System.out.println(days + " " + "Java teoria okuim... ");
//        Days days1 = Days.SHEISHEMBI;
//        System.out.println(days1 + " " + "Anglis tilin okuim... ");
//        Days days2 = Days.BEISHEMBI;
//        System.out.println(days2 + " " + "Soft Scills okuibuz... ");
//        Days days3 = Days.ISHEMBI;
//        System.out.println(days3 + " " + "Koshumcha session... ");
//        Days days4 = Days.JEKSHEMBI;
//        System.out.println(days4 + " " + "Es alabyz... ");


    Days days = Days.DUISHOMBU;
        switch (days) {
            case DUISHOMBU -> System.out.println("Java teoria okuim...");
            case SHEISHEMBI -> System.out.println("Anglis tilin okuim... ");
            case BEISHEMBI -> System.out.println("Soft Scills okuibuz... ");
            case ISHEMBI -> System.out.println("Koshumcha session... ");
            case JEKSHEMBI -> System.out.println("Es alabyz... ");
        }

//        if(days.equals(Days.JUMA)) {
//            System.out.println("Teoria okuibuz.");
//        }else if (days.equals(Days.SHARSHEMBI));
//        System.out.println("Java ");


        }
    }

