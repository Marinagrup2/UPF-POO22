public class AudioBuffer extends Vector {
    
    public AudioBuffer(int d){
        super(d);

    }


    public void changeVolume(double delta){
        if (delta == 0){
            System.out.print("no se ha incrementado el volumen");
        } else{
            this. multiplyVectValue(delta);
        }
        

    }


    




}
