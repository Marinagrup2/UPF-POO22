public class Matrix {

    private Vector[] valores;
    private int rows;
    private int cols;

    public Matrix(int n, int m){
        this.rows = n;
        this.cols = m;
        valores = new Vector[m];
        for(int i=0;i<valores.length;i++){
            valores[i] = new Vector(n);
        }
    }

    public void setMatrix(int i, int j, double valor){
        valores[i].set(j, valor);
    }

    public double getMatrix(int i, int j){
        return valores[i].getValor(j);
    }

    public void MultiplyMatValue(double s){

        for(int i = 0; i < rows; i++){
            for(int j= 0; j < cols; j++ ){
                double v = valores[i].getValor(j);
                valores[i].set(j, v*s);
            }
        }

    }

    

    public void Create3DRotationMat(double alpha){

        if(valores.length == 3){
            valores[0].set(0, 0);
            valores[0].set(1, -Math.sin(alpha));
            valores[0].set(2,0);
            valores[1].set(0,Math.sin(alpha));
            valores[1].set(1, 0);
            valores[1].set(2,0);
            valores[2].set(0,0);
            valores[2].set(1,0);
            valores[2].set(2,1);

        }

    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void PrintMatrix(){

        for(int k=0; k < valores.length; k++){
            valores[k].PrintVector();
        }
        System.out.print("\n");

    }

    public void zeroM(){
        for(int l = 0; l < valores.length; l++){
            valores[l].zero();
        }
    }

    public Vector[] getValores() {
        return this.valores;
    }
    
}
