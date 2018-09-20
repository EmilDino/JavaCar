import java.awt.*;  //downloader alt fra Java abstact toolkit libary

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(25.5,   // Laver en Car som hedder myCar og sætter dens AverageMPG til 25.5
                "1BC32E",            // asigner dens licenseplate til 1BC32E
                Color.BLUE,                        // asigner dens farve til blå
                true);          // asigner den ATW til true

        Car sallyCar = new Car(13.9, // samme proces som ovenfor
                "3D20BN",
                Color.BLACK,
                false);

        System.out.println("myCar's license plate:" + myCar.licensePlate);       // for den til printe myCar's lince plate ud
        System.out.println("sallyCar's license plate:" + sallyCar.licensePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
    }
}
