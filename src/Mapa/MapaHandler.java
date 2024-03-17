package Mapa;

public class MapaHandler {
    public char[][] mapa;
    public int size;

    private int sentido = 0; // 0 = inicial, 1 = cima, 2 = direita, 3 = baixo, 4 = esquerda

    public MapaHandler(int size, char[][] mapa) {
        this.size = size;
        this.mapa = mapa;
    }

    public void printMapa() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }

    private String startCoordinates(){
        for (int i = 0; i < size; i++) {
            if(mapa[i][0] == '-') {
                return i + ";0";
            }
        }
        return "0;0";
    }
}
