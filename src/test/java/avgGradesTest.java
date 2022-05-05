import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class avgGradesTest {
    @Test
    void test(){
        var avgGrade = new avgGrades();
        int [] array = {90, 90, 90};
        assertEquals("Excellent",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_1(){
        var avgGrade = new avgGrades();
        int [] array = {100, 100, 100};
        assertEquals("Excellent",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_2(){
        var avgGrade = new avgGrades();
        int [] array = {101, 100, 100};
        assertEquals("Not a valid grade",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_3(){
        var avgGrade = new avgGrades();
        int [] array = {-1, -1, 70};
        assertEquals("Not a valid grade",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_4(){
        var avgGrade = new avgGrades();
        int [] array = {};
        assertEquals("No Grades",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_5(){
        var avgGrade = new avgGrades();
        int [] array = {80, 80, 80};
        assertEquals("Very good",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_6(){
        var avgGrade = new avgGrades();
        int [] array = {70, 70, 70};
        assertEquals("Very good",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_7(){
        var avgGrade = new avgGrades();
        int [] array = {60, 60, 60};
        assertEquals("Fair",avgGrade.avarageGrads(array),"" );
    }
    @Test
    void test_8(){
        var avgGrade = new avgGrades();
        int [] array = {59, 59, 59};
        assertEquals("you fail",avgGrade.avarageGrads(array),"" );
    }
}