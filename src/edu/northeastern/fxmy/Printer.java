package edu.northeastern.fxmy;

class Printer extends Thread{

    private static Printer _instance;

    private Printer() {
    }

    String name = "default";
    private static Object obj = new Object();

    public static Printer getInstance() {

        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Printer();
                }
            }
        }

        return _instance;
    }

    public void getConnection(){

        for(int i = 0;i<10;i++){
            System.out.println("get connected");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("not get connected");
    }
}
