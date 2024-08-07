package mod17;

public class question1E {
    public static void main(String[] args) {
        int q=10;
        for(int i=0;i<=q;i++){
            for(int j=0;j<=q;j++){
                if(i==0 || j==0 ||i==q ||  i==(q/2)){
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
