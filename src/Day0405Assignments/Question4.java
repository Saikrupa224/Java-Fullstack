package Day0405Assignments;

class Question4 {
    public final  int variable1 =20;
    final void finalmethod(){
        System.out.println("This is the final method");
    }
    public static void main(String[] args){
        Question4 question4 = new Question4();
        System.out.println("Final variable is "+question4.variable1);
        question4.finalmethod();
    }
}
