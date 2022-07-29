package DZ_2;

public class Raspisanie {
    int platformNumber;
    String trainNumber;


    void otpravka() {
        if (platformNumber == (2 - 1)) {
            System.out.println("Едем в Казань");
        }

        else if (platformNumber == 4/2){
                System.out.println("Едем в Петрозаводск");
        }

        else {
            System.out.println("Едем в Мурманск");
        }
    }

    void platformNumber() {
        System.out.println("Номер платформы: " + trainNumber);
    }
}
