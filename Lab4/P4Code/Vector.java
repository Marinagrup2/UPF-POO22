import java.util.Arrays;

public class Vector{

    private  double[] values;
    private  int dimension;

    

    public Vector(int dim){
        this.dimension = dim;
        values = new double[dimension];

    }

    public void set(int i, double val) {
        values[i] = val;
        
    }

    public Double getValor(int i){
        return values[i];
    }

    public void set3D(double i, double j, double k){
        if(values.length == 3){
            values[0] = i;
            values[1] = j;
            values[2] = k;
        }

    }

    public void multiplyVectValue(double s){
        for(int i= 0; i<values.length; i++){
            values[i] *= s;
        }

    }

    
    public void matrixMultiply(Matrix matrix){

        if(values.length != matrix.getRows()){
            System.out.print("Esta operación no es possible");
        }else{
            
            Vector vector = new Vector(matrix.getRows());
            vector.zero();
                        
            for(int j = 0; j < matrix.getRows(); j++){
                double suma= 0;
                    for(int k= 0; k < matrix.getCols(); k++){
                        double matval = matrix.getMatrix(j, k);
                        double vectval = values[k];
                        suma += matval*vectval;
                    } 
                    vector.set(j, suma);
                }
               this.setValues(vector.getValues());
            
        }
        

    }

    public void setValues(double[] values) {
        this.values = values;
    }

    public double[] getValues() {
        return values;
    }

    public void PrintVector(){
        System.out.print("[");
        for(int i= 0; i<dimension; i++){
            System.out.print(values[i]);
            if(i<dimension-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.print("\n");
    }

    public void zero() {
        //possa a zero tots els valors del vector
        for(int i = 0; i < dimension; i++){
            values[i] = (double) 0;
        }
    }

    

    

}