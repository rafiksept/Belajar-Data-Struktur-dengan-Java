package belajar.data.utils;

public class QueueUtil {
    private String[] antrian;
    private Integer maxAntrian;
    private  String[] antrianFixed;

    public QueueUtil(String[] antrian, Integer maxAntrian){
        this.maxAntrian = maxAntrian;
        this.antrian = antrian;
    }

    public String[] getAntrian() {
        return antrian;
    }

    public void setAntrian(String[] antrian) {
        this.antrian = antrian;
    }

    public Integer getMaxAntrian() {
        return maxAntrian;
    }

    public void setMaxAntrian(Integer maxAntrian) {
        this.maxAntrian = maxAntrian;
    }

    public void queue(){
        if(this.antrian != null || this.maxAntrian != null){
            this.antrianFixed = new String[this.maxAntrian];
            String ShowAntrian = MergingUtil.merging(this.antrian);
            System.out.println("antrian sekarang: " + ShowAntrian);
            System.out.println("jumlah antrian: " + maxAntrian + " orang");
            for (int i = 0; i < this.antrian.length; i++) {
                if (i < this.maxAntrian){
                    System.out.println(this.antrian[i] + " masuk antrian");
                    this.antrianFixed[i] = this.antrian[i];
                } else {
                    System.out.println("Maaf " + this.antrian[i] + " antrian sudah penuh");
                }
            }
        } else {
            System.out.println("tidak boleh null");
        }

    }

    public void dequeue(){
        if(this.antrianFixed != null || this.maxAntrian != null){
            System.out.println("Satu per satu keluar dari antrian");
            for (var i = 0 ; i < this.antrianFixed.length; i++){
                System.out.println(this.antrianFixed[0] + " Keluar Antrian" );
                this.antrianFixed = UpdateArr.updateData(this.antrianFixed);
                System.out.println(MergingUtil.merging(this.antrianFixed));
            }

            System.out.println("Antrian Kosong");
            System.out.println("Jumlah antrian: 0 orang");
        } else {
            System.out.println("tidak boleh null");
        }
    }
}
