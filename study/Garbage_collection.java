package study;

public class Garbage_collection {
    @Override
    protected void finalize() throws Throwable {
        // Cleanup code
        System.out.println("Object is being garbage collected");
    }
    public static void main(String[] args) {
        // --> The garbage collection in java works by using the mark and sweep from younger generation to the
        // older generation heap --->
        /**-->
         The garbage collection in java is used to clean the unused objects that floats up in the memory
         This is bascically done by using the jvm itself we can also manually create a garbage collection
         **/
        String s = new String("Abiinanth");// Inbuild class which has the value of abiinanth as a single instance
        s=null;
        // now the actual object thats been created at first is now floating in the memory without a reference
        System.gc(); // request garbage collection
        System.out.println("GC requested");

    }
}
