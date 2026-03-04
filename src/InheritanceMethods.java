class SmartPhone{
    void TakePhoto(){
        System.out.println("Smart Phone can capture photo");
    }
    void playSong(){
        System.out.println("Smart phones can play songs");
    }
}

class CameraDSLR extends SmartPhone{
    void highPixel(){
        System.out.println("DSLR camera has higher pixel");
    }
    void TakePhoto(){
        System.out.println("DSLR can also take photos");
    }
}

class Radio extends SmartPhone{
    void playSong(){
        System.out.println("Radio plays the songs");
    }
    void news(){
        System.out.println("Radio telecasts the news");
    }
}

public class InheritanceMethods {
    public static void main(String[] args){
        Radio r = new Radio();
        r.playSong();
        r.news();
    }
    
}
