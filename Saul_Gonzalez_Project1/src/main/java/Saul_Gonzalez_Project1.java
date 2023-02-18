public class Saul_Gonzalez_Project1 {
    private static <T> void testIsEmpty(BagInterface<T> testBag){
        System.out.println("\nTesting the isEmpty method...");
        if(testBag.isEmpty()){
            System.out.println("TEST RESULT: The bag is empty: ");
        } else {
            System.out.println("TEST RESULT: The bag is not empty: ");
        }
    }
    private static <T> void testAdd (BagInterface<T> testBag, T[] contents){
        System.out.println("Testing the add method...");
        System.out.println("Adding the contents into the LinkedBag...");
        for (int i = 0; i < contents.length; i++) {
            if (testBag.add(contents[i])) {
                System.out.println(contents[i] + " ");
            } else {
                System.out.println("Failed to add the content(s) into the bag");
            }
        }
        testToArray(testBag);
    }
    //test toARRAY
    private static <T> void testToArray (BagInterface<T> testBag){
        System.out.println("Testing the toArray method...");
        System.out.println("The bag contains the following string(s): ");
        Object[] bagArray = testBag.toArray();
        for (int i = 0; i < bagArray.length; i++){
            System.out.print(bagArray[i] + " ");
        }
    }
    public static void main(String[] args){
        BagInterface<String> testBag = new LinkedBag<>();
        String[] testContentsInBag = {"David", "Kelly", "Luis", "Anthony", "Jason"};
        testIsEmpty(testBag);
        testAdd(testBag, testContentsInBag);
        testIsEmpty(testBag);
    }
}
