public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){


        int megabytes;
        int kilobytes2;
        megabytes = kiloBytes / 1024;
        kilobytes2 = kiloBytes % 1024;

        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes2 + " KB");
        }

    }

}
