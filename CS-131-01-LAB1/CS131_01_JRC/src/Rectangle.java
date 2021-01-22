public class Rectangle{
    int length;
    int width;
    
     public int getLength() {
        return this.length;
     }
     public int getWidth() {
        return this.width;
     }
      
    public Rectangle(){
        this.length=(1);
        this.width=(1);
    }
    public Rectangle(int l, int w){
        this.length=l;
        this.width=w;
    }
    int calculateArea(){
        return this.length*this.width;
    }
    int calculatePerimeter(){
        return 2*(this.length+this.width);
    }

	 //public static void main(String[] args) {
    //  Rectangle obj = new Rectangle();
	 }	


