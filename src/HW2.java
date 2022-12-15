import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) throws Exception {
        Equation();
    }

    public static int GetNumber() {
        Scanner numberS = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Введите число: ");
                number = numberS.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Ошибка ввода");
            }
        }
        return number;
    }

    public static String GetString() {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Введите формулу: ");
        equation = str.nextLine();
        return equation;

    }

    public static void Equation() {

        Map<String, Integer> mapNumbers = new HashMap<String, Integer>();
        mapNumbers.put("0", 0);
        Scanner str = new Scanner(System.in);

        String equation = GetString();
        equation = String.format(equation).replace(" ", "");
        String[] st1 = equation.split("\\+");
        // int[] numbers = new int[st1.length];
        int sum = 0;
        for (int i = 0; i < st1.length; i++) {
            for(Map.Entry<String, Integer> item : mapNumbers.entrySet()){
                if (item.getKey() != st1[i]){
                    mapNumbers.put(st1[i], str.nextInt());
                    break;
                }

            }
        }
        for (Map.Entry<String, Integer> item : mapNumbers.entrySet()){
            sum += item.getValue();
        }
        System.out.println(sum);

    }

}
