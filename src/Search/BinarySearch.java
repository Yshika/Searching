/*
package Search;

public class BinarySearch {
    public static void main(String[] args) {
        int size=10;
        Cars[] car=new Cars[size];
        for (int i = 0; i < car.length; i++) {
            car[i]=new Cars("Car "+i,i*1000000);
        }
        int price=5000000;
        int index=binary(car,price);
    }
}
public static int binary(Car[] car,int price){
    int pos=-1;
    int beg=0;
    int end=car.length-1,mid;
    while(beg<=end){
        mid=(beg+end)/2;
        if(car[mid].getPrice()==price){
            pos=mid;
            break;
        }
        else if(car[mid].getPrice()>price){
            pos=mid+1;
        }
        else{
            pos=mid-1;
        }
    }
    return pos;
}}
class Cars{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
*/
