import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void TestCaseOne(){
        int matrix[][] = {{1,0}, {1,1}};
        int expectedMatrix[][] = {{0,0}, {1,0}};
        int actualMatrix[][] = MatrixManipulation.manipulateMatrixWithZero(matrix);
        Assert.assertArrayEquals(expectedMatrix, actualMatrix);
    }
    @Test
    public void TestCaseTwo(){
        int matrix[][] = {{1,2,3}, {0,4,5}, {6,0,7}};
        int expectedMatrix[][] = {{0,0,3}, {0,0,0}, {0,0,0}};
        int actualMatrix[][] = MatrixManipulation.manipulateMatrixWithZero(matrix);
        Assert.assertArrayEquals(expectedMatrix, actualMatrix);
    }
    @Test
    public void TestCaseThree(){
        int matrix[][] = {{10,15,0}, {20,0,25}, {0,30,35}};
        int expectedMatrix[][] = {{0,0,0}, {0,0,0}, {0,0,0}};
        int actualMatrix[][] = MatrixManipulation.manipulateMatrixWithZero(matrix);
        Assert.assertArrayEquals(expectedMatrix, actualMatrix);
    }
    @Test
    public void TestCaseFour(){
        int matrix[][] = {{1,2,3,0}, {4,5,6,7}, {8,0,9,10}, {11,12,0,13}};
        int expectedMatrix[][] = {{0,0,0,0}, {4,0,0,0}, {0,0,0,0}, {0,0,0,0}};
        int actualMatrix[][] = MatrixManipulation.manipulateMatrixWithZero(matrix);
        Assert.assertArrayEquals(expectedMatrix, actualMatrix);
    }
    @Test
    public void TestCaseFive(){
        int matrix[][] = {{9,7,10,19}, {11,0,0,18}, {17,12,6,98}, {99,74,87,5}};
        int expectedMatrix[][] = {{9,0,0,19}, {0,0,0,0}, {17,0,0,98}, {99,0,0,5}};
        int actualMatrix[][] = MatrixManipulation.manipulateMatrixWithZero(matrix);
        Assert.assertArrayEquals(expectedMatrix, actualMatrix);
    }
    @Test
    public void TestCaseSix(){
        int matrix[][] = {{9,7,10,19,0,1}, {11,0,0,18,2,3}, {17,12,6,98,4,5}, {99,74,87,5,6,0}};
        int expectedMatrix[][] = {{0,0,0,0,0,0}, {0,0,0,0,0,0}, {17,0,0,98,0,0}, {0,0,0,0,0,0}};
        int actualMatrix[][] = MatrixManipulation.manipulateMatrixWithZero(matrix);
        Assert.assertArrayEquals(expectedMatrix, actualMatrix);
    }
}
