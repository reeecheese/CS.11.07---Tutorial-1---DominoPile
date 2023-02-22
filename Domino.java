public class Domino {
    int top; int bottom;
    public Domino(){
        top = 0; bottom = 0;
    }
    public Domino(int first, int second){
        top = first; bottom = second;
    }
    public int getTop(){return top;}
    public int getBottom(){return bottom;}
    public void setTop(int set){top = set;}
    public void setBottom(int set){bottom = set;}
    public String toString(){return top + " / " + bottom;}

    public void flip(){
        int tempTop = top; top = bottom; bottom = tempTop;
    }
    public void settle(){
        if (top > bottom){
            flip();}
    }
    public int compareTo(Domino other){
        System.out.println(other);
        if(this.top < other.top){ return -1;}
        if(this.top > other.top){ return 1;}
        if(this.top == other.top) {
            if(this.bottom < other.bottom){ return -1;}
            if(this.bottom > other.bottom){ return 1;}
        }return 0;}

    public int compareToWeight(Domino other){
        int dotsOnHalf = bottom/2 + top/2;
        if(dotsOnHalf < other.bottom){ return -1;}
        if(dotsOnHalf > other.bottom){ return 1;}
        return 0;
    }

    public boolean canConnect(Domino other){
        if(this.top == other.top){ return true;}
        if(this.top == other.bottom){ return true;}
        if(this.bottom == other.top){ return true;}
        if(this.bottom == other.bottom){ return true;}
        return false;
    }
}
