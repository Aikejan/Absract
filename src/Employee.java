public class Employee extends Person {
    private long id;

    public Employee(String name, String gender, long id) {
        super(name, gender);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return   "id:" + id ;
    }

    @Override
    public void work() {
        if (id == 0) {
            System.out.println(" Жумушчу иштейт");
        } else {
            System.out.println(" Жумушчу иштебейт");

        }

    }



    }
