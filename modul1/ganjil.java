public class ganjil {
    public static void main(String[] args) {
        int [] bil = {23, 6, 47, 35, 2, 14};
        System.out.println("");
        System.out.print("Bilangan Ganjil :  ");
        for (int i = 0; i < bil.length; i++){
            if (bil [i] % 2!= 0){
                System.out.print(bil[i] + " ");
            }
        }      
        System.out.println("");
    }
}