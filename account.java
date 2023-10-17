
public class account {
    private String hesapno;
    private double bakiye;
    private String isim;
    private String email;
    private String telno;
     
    public account(){
        System.out.println("constructor calıstı");
    }
    public account(String hesapno,double bakiye,String isim,String email,String telno){
        this.hesapno=hesapno;
        this.bakiye=bakiye;
        this.isim=isim;
        this.email=email;
        this.telno=telno;
    }
    public void parayatir(double miktar){
      bakiye+=miktar;
        System.out.println("yeni bakiye:"+bakiye);
    }
    public void paracekme(double miktar){
        if(miktar>15000){
            System.out.println("para cekme sinirini astiniz");
        }
        else if(miktar>bakiye){
            System.out.println("hesabinizda bu kadra para yok.Bakşyeniz:"+bakiye);
        }
        else{
             bakiye-=miktar;
             System.out.println("yeni bakiye:"+bakiye);
        }
           
      
    }
    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }
    
    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelno() {
        return telno;
    }
    public void setTelno(String telno) {
        this.telno = telno;
    }
    
           
    
}
