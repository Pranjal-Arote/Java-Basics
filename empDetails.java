class empDetails {

    int id;
    String name;

    public void setId(int i) {
        id = i;
        System.out.println("ID is" + i);
    }

    public void setName(String Name) {
        name = Name;
        System.out.println("Name is" + Name);
    }

    public static void main(String args[]) {
        empDetails obj = new empDetails();
        obj.setId(1);
        obj.setName("Pranjal");
    }
}