package Day0405Assignments;
class class1 {
    protected int Var1;
    public class1(int variable1){
        this.Var1 = variable1;
    }
}

class class2 extends class1 {
    protected int Var2;
    public class2(int variable1,int variable2){
        super(variable1);
        this.Var2 = variable2;
    }
   public class2(int variable2){
        super(0);
       this.Var2 = variable2;
   }
}
public class Question2 {
}
