interface Drawable{  
    public void draw();  
}  
public class LambdaExpressionWithout {  
    public static void main(String[] args) {  
        int width=10;  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
    }  
}  