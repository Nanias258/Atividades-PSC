package teste;

public class Teste {

    
    public static void main(String[] args) {
        DB db = new DB("banco01.db");
        db.query("SELECT * FROM filme");
        while(db.next()) {
            int codigo = db.getInt("codigo");
            String nome = db.getString("titulo");
            int ano = db.getInt("ano");
            System.out.println("CODIGO: "+codigo+" TITULO: "+nome+"ANO: "+ano);
        }
        db.closeConnection();
    }
    
}
