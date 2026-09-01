public class Main{
    public static void main(){
        PruebaPila prueba=new PruebaPila();
        System.out.println(prueba.revisarSintaxis("{5+[2*7*(5-2)-9]+20}+1"));
        int[] nums=new int[5];
        nums[0]=-5;
        nums[1]=2;
        nums[2]=1;
        nums[3]=9;
        nums[4]=2;
        prueba.ordenarNumsPila2(nums);
    }
}
