package mod17;

public class question1G {
    public static void main(String[] args) {
        int q=10;
        for(int i=0;i<=q;i++){
            for(int j=0;j<=q;j++){
                if(i==0 && j!=q || j==0 && i!=0||i==q && j!=q || j==q && i>=(q/2)  || i==(q/2)&& j>=(q/2)){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
