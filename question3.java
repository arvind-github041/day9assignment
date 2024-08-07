package mod17;

public class question3 {
    public static void main(String[] args) {
        int q=4;
        for(int i=0;i<=q;i++){
            for(int j=0;j<=q;j++){
                if(i+j<=q){
            
                    System.out.print("*");
            
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=q;j>=0;j--){
                if(i+j<=q ){
            
                    System.out.print("*");
            
                }
                else{
                    System.out.print(" ");
                }
    
            }
           System.out.println();
        }
        for(int i=0;i<=q ;i++){
            for(int j=0;j<=(2*q)+1;j++){
                if(j==0|| j==(2*q)+1 || i==q){
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
