package sg.edu.rp.c346.id20028056.demo_todolist;

public class AndroidVersion {
    private  String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version=version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String toString(){
        return name +": "+ version;
    }
}
