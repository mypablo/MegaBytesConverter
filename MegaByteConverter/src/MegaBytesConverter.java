public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

    //variables
        int megabytes;
        int kilobytes2;
        
    //calculating
        megabytes = kiloBytes / 1024;
        kilobytes2 = kiloBytes % 1024;
        
    //if-loop
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes2 + " KB");
        }

    }

}
