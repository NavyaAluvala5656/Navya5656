public class JVMArchitecture {
    public static void main(String[] args) {
        // Print 15 sentences about the architecture of the JVM
        System.out.println("1. The Java Virtual Machine (JVM) is a key component of the Java platform.");
        System.out.println("2. The JVM allows Java programs to run on any device or operating system.");
        System.out.println("3. The JVM executes Java bytecode, which is compiled from Java source code.");
        System.out.println("4. The JVM architecture consists of several components: Class Loader, Runtime Data Areas, Execution Engine, and Native Interface.");
        System.out.println("5. The Class Loader is responsible for loading class files into the JVM.");
        System.out.println("6. The Class Loader performs three main tasks: loading, linking, and initialization.");
        System.out.println("7. Runtime Data Areas are memory areas allocated by the JVM during execution.");
        System.out.println("8. The Runtime Data Areas include Method Area, Heap, Stack, PC Registers, and Native Method Stack.");
        System.out.println("9. The Method Area stores class structures like runtime constant pool, method data, and field data.");
        System.out.println("10. The Heap is used for dynamic memory allocation of Java objects and JRE classes.");
        System.out.println("11. Each thread has its own JVM Stack, which stores frames, local variables, and partial results.");
        System.out.println("12. The Program Counter (PC) Register contains the address of the currently executing JVM instruction.");
        System.out.println("13. The Native Method Stack is used for native method calls in the application.");
        System.out.println("14. The Execution Engine is responsible for executing the bytecode instructions.");
        System.out.println("15. The Execution Engine includes the interpreter, Just-In-Time (JIT) compiler, and garbage collector.");

        System.out.println("16. The Interpreter reads and executes the bytecode instructions one at a time.");
        System.out.println("17. The JIT compiler improves performance by compiling bytecode into native machine code at runtime.");
        System.out.println("18. The garbage collector automatically manages memory by reclaiming unused objects.");
        System.out.println("19. The Native Interface provides the ability to interact with native applications and libraries.");
        System.out.println("20. The JVM ensures platform independence by abstracting away the underlying hardware and OS.");
    }
}