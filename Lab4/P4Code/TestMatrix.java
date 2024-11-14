public class TestMatrix {


    public static void main(String[] args) {

        Matrix m = new Matrix(2,2);
        m.setMatrix(0, 0, 1);
        m.setMatrix(0, 1, 0);
        m.setMatrix(1, 0, 0);
        m.setMatrix(1, 1, 1);
        m.PrintMatrix();
        m.MultiplyMatValue(2);
        m.PrintMatrix();
        m.zeroM();
        m.PrintMatrix();

        Vector vector = new Vector(3);
        vector.set3D(1, 0, 0);

        Matrix ma = new Matrix(3, 3);
        ma.Create3DRotationMat(Math.PI/2);
        ma.PrintMatrix();

        vector.PrintVector();
        vector.matrixMultiply(ma);
        vector.PrintVector();
        

        Vector v = new Vector(3);
        v.set(0, 1);
        v.set(1, 2);
        v.set(2, 3);
        v.PrintVector();
        v.multiplyVectValue(4);
        v.PrintVector();
        v.zero();
        v.PrintVector();

        //AudioBuffer
        AudioBuffer a = new AudioBuffer(3);
        a.set3D(2,3,4);
        a.changeVolume(6);
        a.PrintVector();
        
        


        
    }
    
}
