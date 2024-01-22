package basics;

import accessmodifiers.*;

public class access extends accessmodifiers.car{
    public static void main(String[] args) {
        andaman a=new andaman();
        System.out.println(a.roll);//accessing method and variable of different package
        a.roll();
    }

}
