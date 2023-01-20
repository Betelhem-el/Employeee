 class Employeee {
    String name;
    int id;

    //with out argu

    public Employeee () {
        this.name = "NULL";
    }

    //one parameter  constructor
    public Employeee (String n) {
        this.name = n;
    }

    // two parameter constructor
    public Employeee (String n, int i) {
        this.id = i;
        this.name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }



        public static void main(String[] args) {
            Employeee emp1 = new Employeee();
//        System.out.println(emp1);

            Employeee emp2 = new Employeee("kebede");
//        System.out.println(emp2);

            Employeee emp3 = new Employeee("abebe", 25);
//        System.out.println(emp3);

            emp1.display();
            emp2.display();
            emp3.display();
        }


}