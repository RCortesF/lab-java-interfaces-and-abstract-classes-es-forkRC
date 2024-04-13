package inte;

import java.util.Arrays;

public class IntVector implements IntLIst{

    int[] teacher = new int[20];
    @Override
    public String add(int number) {
        return Arrays.toString(teacher);
    }

    @Override
    public int get(int id) {
        return teacher[id];
    }
}
