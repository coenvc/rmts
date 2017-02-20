package rmts.Models;

/**
 * Created by fhict on 20/02/2017.
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public boolean Test(){
        return true;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
