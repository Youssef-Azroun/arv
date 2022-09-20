public class pokemon {
   protected String name;
   private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public pokemon(String name, String type) {
        this.name = name;
        this.type = type;


    }
    public void attack(){
        System.out.println(this.name + " Attack!");
    }
}
