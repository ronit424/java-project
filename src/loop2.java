public class loop2 {
    public static void main(String[] args) {
        int[] myintarry = {100,31,26,49,52};
        for(int index=0 ; index < 5 ; index++)
        {
            System.out.println(myintarry[index]);
        }
        for(int element : myintarry)
        {
            System.out.println(element);
        }
    }
}
