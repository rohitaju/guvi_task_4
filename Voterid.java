public class Voterid {
    String name;
    int voterId;
    int age;

    Voterid(String name , int voterId , int age ) {
        try {
            if (age < 18) {
                System.out.println("invalid age for voter");
            }else {
                System.out.println("valid for voting");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        this.age = age;
        this.name = name;
        this.voterId =voterId;
    }

    void dispaly(){
        System.out.println("my name is "+name);
        System.out.println("my age is "+age);


    }
}


class voter{
    public static void main(String[] args) {
        Voterid obj = new Voterid("Rohit ", 12345 , 18);

        obj.dispaly();
    }
}