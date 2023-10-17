
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

    /**
     * @param hesapno the hesapno to set
     */
    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telno
     */
    public String getTelno() {
        return telno;
    }

    /**
     * @param telno the telno to set
     */
    public void setTelno(String telno) {
        this.telno = telno;
    }
    
           
    
}
