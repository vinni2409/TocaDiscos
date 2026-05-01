import java.util.ArrayList;
import java.util.List;

public class EstanteCds {
    List<CD> listaDeCds = new ArrayList<>();

    public void guardaCd(CD cd){
        listaDeCds.add(cd);
    }

    public void listarCds(){
        for(CD cd : listaDeCds){
            System.out.println(cd);
        }
    }

}



