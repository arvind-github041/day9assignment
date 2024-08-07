package mod17;

public class question2 {
    public static void main(String[] args) {
        int q=8;
        for(int i=0;i<=q;i++){
            for(int j=0;j<=q;j++){
                if(i+j==q|| i==q){
            
                    System.out.print("*");
            
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=q;j>=0;j--){
                if(i+j==q || i==q){
            
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
