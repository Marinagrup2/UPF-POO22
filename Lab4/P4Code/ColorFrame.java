public class ColorFrame extends Frame {

    private int[] valToRGB(double rgb){
        int[] ret = new int[3];
        ret[0] = ((int) rgb >> 16) & 255;
        ret[1] = ((int) rgb >> 8) & 255;
        ret[2] = ((int) rgb) & 255;
        return ret;
    }


    private double RGBToVal(int r, int g, int b){
        double ret = (r << 16) | (g << 8) | b;
        return ret;
    }


    public ColorFrame(int i, int m){
        super(i, m);
    }

    
    public void setRGB(int i,int j , int r, int g, int b){
        double ret = RGBToVal(r, g, b);
        setMatrix(i, j, ret);
        
    }


    public int[] getRGB(int i, int j){
        return this.valToRGB(this.getValores()[i].getValues()[j]);
    }

    @Override
    public void changeBrightness(double delta){
        // TODO Auto-generated method stub
        if (delta == 0){
            System.out.print("no se ha incrementado el brillo");
        } else{
            this.MultiplyMatValue(delta);
        }
    
    }

    public void changeRGB(int dR,int dG, int dB){
        for (int i = 0; i < this.getValores().length; i++){
            for (int j = 0; j < this.getValores()[i].getValues().length; j++){
                int[] rgb1 = getRGB(i,j);
                int r  = rgb1[0] * dR;
                int g  = rgb1[1] * dG;
                int b  = rgb1[2] * dB;
                setRGB(i,j,r,g,b);
            }
        }       
                






        
    }


    


}
