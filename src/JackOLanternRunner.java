public class JackOLanternRunner {
    public static void main(String[] args){
        String[][] face = new String[6][12];
        JackOLantern face1 = new JackOLantern(face);

        face1.fill("X");
        face1.edit(" ",0,0);
        face1.edit(" ",0,1);
        face1.edit(" ",0,11);
        face1.edit(" ",0,10);
        face1.edit(" ",5,1);
        face1.edit(" ",5,10);
        face1.edit(" ",5,11);
        face1.edit(" ",5,0);

        face1.edit(" ",1,2);
        face1.edit(" ",1,3);
        face1.edit(" ",2,2);
        face1.edit(" ",2,3);
        face1.edit(" ",1,8);
        face1.edit(" ",1,9);
        face1.edit(" ",2,8);
        face1.edit(" ",2,9);
        face1.edit(" ",1,4);
        face1.edit(" ",2,4);
        face1.edit(" ",1,7);
        face1.edit(" ",2,7);

        face1.edit("!",3,1);
        face1.edit("!",4,2);
        face1.edit("!",4,3);
        face1.edit("!",3,4);
        face1.edit("!",3,10);
        face1.edit("!",4,9);
        face1.edit("!",4,8);
        face1.edit("!",3,7);

        face1.edit("!",4,5);
        face1.edit("!",4,6);
        System.out.println(face1);
        
    }

}
