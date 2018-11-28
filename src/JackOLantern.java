public class JackOLantern {
    private String[][] face;

    public JackOLantern(String[][] face){
        this.face = face;
    }

    public void fill(String line){
    for (int a = 0; a < face.length; a++ ){
        for (int b = 0; b < face[a].length; b++){
            face[a][b] = line;
        }
    }

    }

    public void edit(String replace, int row, int column){
        face[row][column] = replace;
    }

    public String toString(){
        String Jack ="";
        for (int a = 0; a < face.length; a++){
            for(int b = 0; b < face[a].length; b++){
                Jack = Jack+face[a][b];
        }
        Jack = Jack+"\n";
    }
    return Jack;
    }
}
