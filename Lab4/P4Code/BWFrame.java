import java.util.Set;

public class BWFrame extends Frame{

    public BWFrame(int n, int m){
        super(n, m);

    }

    public void Set(int i, int j, int val){
        this.setMatrix(i, j, val);

    }

    public  int getBW(int i, int j){
        int result = (int)getMatrix(i, j);
        return result;
    }

    @Override
    public void changeBrightness(double delta) {
        // TODO Auto-generated method stub
        if (delta == 0){
            System.out.print("no se ha incrementado el brillo");
        } else{
            this.MultiplyMatValue(delta);
        }
        
    }
}
