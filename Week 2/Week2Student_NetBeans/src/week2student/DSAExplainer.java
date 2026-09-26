package week2student;

/**
 * TODO 1: Complete the DSA explanation methods.
 */
public class DSAExplainer {
    public static void printWhatIsDSA() {
        System.out.println("2) What is DSA?");
        System.out.println("   Data Structure: " + explainDataStructure());
        System.out.println("   Algorithm: " + explainAlgorithm());
        System.out.println("   DSA: " + explainDSA());
        System.out.println();
    }

    public static String explainDataStructure() {
        // TODO 1A: Mention organizing and storing data efficiently.
        return "A data structure is a way of organizing and storing data efficiently.";
    }

    public static String explainAlgorithm() {
        // TODO 1B: Mention step-by-step instructions for solving a problem.
       return "An algorithm is a set of step-by-step instructions for solving a problem.";
    }

    public static String explainDSA() {
        // TODO 1C: Mention choosing suitable structures and algorithms.
        return "DSA means choosing suitable data structures and algorithms to solve problems efficiently.";
    }
}
