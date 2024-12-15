package class1;

/**
 * 2. 배열로 개선한 버전
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNameArray = {"학생1", "학생2"};
        int[] student1AgeArray = {15, 18};
        int[] student1GradeArray = {90, 100};

        for(int index = 0; index < studentNameArray.length ; index++) {
            System.out.println(index + " : " + studentNameArray.length);
            System.out.println(index < studentNameArray.length);
            System.out.println("이름: " + studentNameArray[index] + ", 나이: " + student1AgeArray[index] + ", 성적: " + student1GradeArray[index]);
            System.out.println();
        }
    }
}
