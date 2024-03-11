package topicone;

public class ExampleCorrect {
    /**
     This example show the behavior for topic two that is "Only level of indentation per method",
     in other words, don't use more than one indentation in your code.
     */
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{2,1},{1,2}};

        traverseLines(matriz);
    }

    private static void traverseLines(int[][] matriz){
        // identetion 0
        for(int i = 0; i < matriz.length; i++ ){
            // indentetion 1
            traverseColumns(matriz[i]);
        }
    }

    private static void traverseColumns(int[] lines) {
        // indentation 0
        for(int j = 0; j < lines.length; j++){
            // indentation 1
            System.out.println(lines[j]);
        }
    }
}

