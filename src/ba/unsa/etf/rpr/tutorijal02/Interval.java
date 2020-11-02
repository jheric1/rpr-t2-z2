package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    double pocetak;
    double kraj;
    boolean log1;
    boolean log2;
    public Interval(){
        pocetak=0;
        kraj=0;
        log1=false;
        log2=false;
    }
    public Interval(double poc, double kr, boolean logi1, boolean logi2) {
        if(poc>kr) throw new IllegalArgumentException();
        pocetak=poc;
        kraj=kr;
        log1=logi1;
        log2=logi2;

    }

    public static Interval intersect(Interval i, Interval i2) {
        return i;
    }

    public boolean isNull(){
        return pocetak == 0 && kraj == 0 && !log1 && !log2;
    }
    public boolean isIn(double tacka){
        if(tacka>pocetak && tacka<kraj) return true;
        if(tacka==pocetak && log1) return true;
        return tacka == kraj && log2;
    }
    /*public Interval intersect(Interval i){
    }
    public static Interval intersect(Interval i1, Interval i2){

    }
*/
    @Override
    public String toString() {
        if(isNull()) return "()";
        if(this.log1 && !this.log2) return "["+this.pocetak+","+this.kraj+")";
        else if(this.log2 && !this.log1) return "("+this.pocetak+","+this.kraj+"]";
        else return "("+this.pocetak+","+this.kraj+")";
    }

    public boolean equals(Interval obj) {

        return this.pocetak == pocetak && this.kraj == obj.kraj && this.log1 == obj.log1 && this.log2 == obj.log2;
    }

    public Interval intersect(Interval interval) {
        return interval;
    }

}
