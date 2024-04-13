package inte;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayList implements IntLIst{
    int[] students = new int[10];

    @Override
    public String add(int number) {
        students.
        // Si el array no está lleno
        // addIntToArray();

        //Si está lleno
        // createNewArray()
        // addIntToArray();
        return Arrays.toString(students);
    }

    @Override
    public int get(int id) {
        return students[id];
    }

    int[] newStudents = new int[students.length + students.length/2];


    public int getEnglishClass() {
        int englishClass = students.length;
        System.out.println(Arrays.toString(students));
        System.out.println(students.length);
        System.out.println(newStudents.length);

        int[] newStudents = students;
        return englishClass;
    }


}
