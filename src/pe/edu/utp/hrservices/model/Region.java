package pe.edu.utp.hrservices.model;

/**
 * Created by GrupoUTP on 03/06/2016.
 */
public class Region {
    private int id;
    private String name;

    public Region(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Region() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
