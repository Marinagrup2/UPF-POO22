import java.util.Date;
import java.util.LinkedList;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.common.BitMatrix;

public class Delegate extends Member{



    private LinkedList<Regular> regularList;
    private Headquarter headOf;
    
    public Delegate(String n, int p, String e, Headquarter h){
        super(n,p,e,h);
        regularList = new LinkedList<Regular>();
    }

    public void setHeadOf(Headquarter headOf) {
        this.headOf = headOf;
    }

    public void addDependents(Regular r){
        regularList.add(r);

    }

    public Image genDelegateQR(QRLib qrLib){
        Image image = new Image("src/QR/delegateQR.png", 300, 300);
        String text = "This is QR for a Delegate Member. You don't have to care about rising sea levels, if you live on a mega yatch." + " "+ this.getName();
        BitMatrix bm = QRLib.generateQRCodeImage(text, 300, 300);
        image.setBitMatrix(bm);

        return image;
    }

    public Image genRegularQR(QRLib qrLib){
        Image image = new Image("src/QR/regularQR.png", 300, 300);
        String text = "This is a QR for a Regular Member. Climate change doesn't matters, if you stay indoors.";
        BitMatrix bm = QRLib.generateQRCodeImage(text, 300, 300);
        image.setBitMatrix(bm);

        return image;

    }

    public boolean singUpDelegate(Delegate d, QRLib q, Image i){
        String textqr = QRLib.decodeQRCodeImage(i.getBitmap());
        String text = "This is QR for a Delegate Member. You don't have to care about rising sea levels, if you live on a mega yatch." + this.getName();
        if(textqr.equals(text)){
            headOf.addMember(d);
            return true;
        }
        return false;
    }

    public boolean singUpRegular(Regular r, QRLib q, Image i){
        String textqr = QRLib.decodeQRCodeImage(i.getBitmap());
        String text = "This is a QR for a Regular Member. Climate change doesn't matters, if you stay indoors";
        if(textqr.equals(text)){
            headOf.addMember(r);
            return true;
        }

        return false;
    }

    
    public String toString() {
        return this.getName();
    }

   

    

}
