import java.util.Arrays;

public class Saul_Gonzalez_Project1 {
    private static final String testString1 = "hello1";
    private static final String testString2 = "hello2";
    private static final String testString3 = "hello3";

    public static boolean testGetCurrentSize() {
        int testSize = 0;
        BagInterface<String> testCurrentSize = new LinkedBag<>();
        if (testCurrentSize.isEmpty()) {
            testCurrentSize.add("J");
            testSize++;
        }

        return testSize == testCurrentSize.getCurrentSize();
    }

    public static boolean testIsEmpty() {
        BagInterface<String> testEmpty = new LinkedBag<>();
        testEmpty.clear();
        return testEmpty.isEmpty() && testEmpty.getCurrentSize() == 0;
    }

    public static boolean testAdd() {
        BagInterface<String> testAdd = new LinkedBag<>();
        if (testAdd.isEmpty()) {
            testAdd.add(testString1);
        }

        boolean areTheyEqual = testAdd.getFrequencyOf(testString1) == testAdd.getCurrentSize();

        return testAdd.getFrequencyOf(testString1) == 1 && areTheyEqual;
    }

    public static boolean testRemove() {
        BagInterface<String> testRemove = new LinkedBag<>();
        String[] test = {testString2, testString1};
        if (testRemove.isEmpty()) {
            testRemove.add(testString1);
            testRemove.add(testString2);
            testRemove.add(testString3);
        }
        testRemove.remove();
        return Arrays.equals(testRemove.toArray(), test);
    }

    public static boolean testRemoveAnEntry() {
        BagInterface<String> testRemoveEntry = new LinkedBag<>();
        if (testRemoveEntry.isEmpty()) {
            testRemoveEntry.add(testString1);
            testRemoveEntry.add(testString2);
            testRemoveEntry.add(testString3);
        }

        testRemoveEntry.remove(testString1);

        return !testRemoveEntry.contains(testString1);
    }

    public static boolean testClear() {
        BagInterface<String> testClear = new LinkedBag<>();
        if (testClear.isEmpty()) {
            testClear.add(testString1);
            testClear.add(testString2);
            testClear.add(testString3);
        }
        if (!testClear.isEmpty()) {
            testClear.clear();
        }
        return testClear.isEmpty();
    }

    public static boolean testGetFrequency() {
        LinkedBag<String> testFrequency = new LinkedBag<>();

        if (testFrequency.isEmpty()) {
            testFrequency.add(testString1);
            testFrequency.add(testString2);
            testFrequency.add(testString2);
        }

        return testFrequency.getFrequencyOf(testString1) == 1 && testFrequency.getFrequencyOf(testString2) == 2;
    }

    public static boolean testContains() {
        LinkedBag<String> containsTest = new LinkedBag<>();
        if (containsTest.isEmpty()) {
            containsTest.add(testString1);
            containsTest.add(testString2);
        }
        return containsTest.contains(testString1) && containsTest.getFrequencyOf(testString1) == 1;
    }

    public static boolean testToArray() {
        LinkedBag<String> arrayTest = new LinkedBag<>();
        String[] testArrayManually = {testString1, testString2, testString3};

        arrayTest.add(testString3);
        arrayTest.add(testString2);
        arrayTest.add(testString1);

        return Arrays.equals(arrayTest.toArray(), testArrayManually);
    }

    public static void main(String[] args) {
        System.out.println("TEST Empty: " + testIsEmpty());
        System.out.println("TEST CurrentSize: " + testGetCurrentSize());
        System.out.println("TEST Add: " + testAdd());
        System.out.println("TEST Remove: " + testRemove());
        System.out.println("TEST RemoveAnEntry: " + testRemoveAnEntry());
        System.out.println("TEST Clear: " + testClear());
        System.out.println("TEST GetFrequency: " + testGetFrequency());
        System.out.println("TEST Contains: " + testContains());
        System.out.println("TEST ToArray: " + testToArray());
    }
}
