/*
"Epsilon handles memory allocation but does not implement any actual memory reclamation mechanism. 
Once the available Java heap is exhausted, the JVM will shut down."

some examples of such cases:
Performance testing
Memory pressure testing
Extremely short lived jobs

java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC MemoryPolluter.java
Starting pollution
Terminating due to java.lang.OutOfMemoryError: Java heap space

java MemoryPolluter.java
Starting pollution
Terminating
*/
public class MemoryPolluter {

    private static final int MEGABYTE_IN_BYTES = 1024 * 1024;
    private static final int ITERATION_COUNT = 1024 * 10;

    public static void main(String[] args) {
        System.out.println("Starting pollution");

        for (int i = 0; i < ITERATION_COUNT; i++) {
            byte[] array = new byte[MEGABYTE_IN_BYTES];
        }

        System.out.println("Terminating");
    }

}