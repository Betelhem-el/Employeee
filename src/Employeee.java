 class employee {
    String name;
    int id;

    //with out argu
     employee() {
        this.name = " ";
    }
    //one parameter  constructor
    employee(String n) {
        this.name = n;
    }

    // two parameter constructor
     employee(String n, int i){
        this.id = i;
        this.name = n;
    }

void display(){
    System.out.println(id+ " "+name);
}

public static void main(String[] args) {
    employee emp1 = new employee();

    employee emp2 = new employee("kebede");
//        System.out.println(emp2);

    employee emp3 = new employee("abebe", 25);
//        System.out.println(emp3);

    emp1.display();
    emp2.display();
    emp3.display();


}
    }
