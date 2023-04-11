import java.io.*;

public class fileIO2 {
    public static void main(String[] args) {
        String binaryOld, binaryNew;
        byte byteIn; int byteOut = 0;

        File fl = new File("C:\\Users\\USER\\Pictures\\lamborghini-aventador-lp-780-4-ultimae-1446x813.jpg");
        File fl2 = new File("C:\\Users\\USER\\Pictures\\lamborghini-aventador-lp-780-4-ultimae-1446x8132.jpg");

        try {
            FileInputStream fis = new FileInputStream(fl);
            DataInputStream dis = new DataInputStream(fis);


            FileOutputStream fos = new FileOutputStream(fl2);
            DataOutputStream dos = new DataOutputStream(fos);

            int i = 0;

            while (true) {

                byteIn = dis.readByte();
                binaryOld = String.format("%8s", Integer.toBinaryString(byteIn & 0xFF)).replace(' ', '0');
                binaryNew = binaryOld.substring(0, 4) + "0000";

                System.out.print(i + ".   "+binaryOld + "      " + binaryNew + "      " + byteIn + "\n");
                byteOut  = Integer.parseInt(binaryNew, 2);

                dos.writeByte((byte) byteOut);
        i++;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }


    }
}
