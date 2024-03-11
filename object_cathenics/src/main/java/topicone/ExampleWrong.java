package topicone;

public class ExampleWrong {
    public static void main(String[] args) {

        int[][] matriz = new int[][]{{2,1},{1,2}};

        // runner per elements in matriz
        // indentation 0
        for(int i = 0; i < matriz.length; i++ ){
            // indentetion 1
            for(int j = 0; j < matriz[i].length; j++){
                // indetention 2
                System.out.println(matriz[i][j]);
            }
        }
    }
}
