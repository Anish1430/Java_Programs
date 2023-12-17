import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElement2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the length of the array from the user
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        // Create an array and fill it with user input
        int[] nums = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the majorityElement function and display the result
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority Elements: " + result);
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (num1 == nums[i])
                count1++;
            else if (num2 == nums[i])
                count2++;
            else if (count1 == 0) {
                num1 = nums[i];
                count1++;
            } else if (count2 == 0) {
                num2 = nums[i];
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1)
                count1++;
            else if (nums[i] == num2)
                count2++;
        }

        if (count1 > nums.length / 3)
            list.add(num1);

        if (count2 > nums.length / 3)
            list.add(num2);

        return list;
    }
}
