import java.io.*;

public class IOBinary {
    public static void main(String[] args) {

        String binarySource;
        byte byteIn;
        int counter =0;

        File fl = new File("C:\\Users\\new\\Desktop\\gym.pdf");
        File fol = new File("C:\\Users\\new\\Desktop\\gym2.pdf");

        try{
            FileInputStream fis = new FileInputStream(fl);
            DataInputStream dis = new DataInputStream(fis);

            FileOutputStream fos = new FileOutputStream(fol);
            DataOutputStream dos = new DataOutputStream(fos);


            while(true){
                byteIn = dis.readByte();
                binarySource = String.format("%8s", Integer.toBinaryString(byteIn & 0xFF)).replace(' ', '0');


                System.out.println(counter + " " + binarySource + " " + byteIn);

                counter++;

                dos.writeByte(byteIn);
            }

        }catch(Exception e){
//            System.out.println("Error " + e);
        }
    }
}