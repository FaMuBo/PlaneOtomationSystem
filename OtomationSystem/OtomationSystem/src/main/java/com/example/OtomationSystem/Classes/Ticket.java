package com.example.OtomationSystem.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Scanner;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer ticketnumber;
    private Integer price;
    private String startingposition;
    private String endposition;

    public Ticket() {
    }

    public Ticket(Long id, Integer ticketnumber, Integer price, String startingposition, String endposition) {
        this.id = id;
        this.ticketnumber = ticketnumber;
        this.price = price;
        this.startingposition = startingposition;
        this.endposition= endposition;
    }

    public Ticket(Integer ticketnumber, Integer price, String startingposition, String endposition) {
        this.ticketnumber = ticketnumber;
        this.price = price;
        this.startingposition = startingposition;
        this.endposition = endposition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTicketnumber() {

        return ticketnumber;
    }

    public void setTicketnumber(Integer ticketnumber) {

        this.ticketnumber = ticketnumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStartingposition() {
        return startingposition;
    }

    public void setSearching(String startingposition) {

        this.startingposition = startingposition;
    }

    public String getEndposition() {

        return endposition;
    }

    public void setCalceling(String endposition) {

        this.endposition = endposition;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", ticketnumber=" + ticketnumber +
                ", price=" + price +
                ", startingposition='" + startingposition + '\'' +
                ", endposition='" + endposition+ '\'' +
                '}';
    }
    public static void main(String[] args){

        Scanner cardnumber=new Scanner(System.in);

        String[]kartnumarası;
        kartnumarası=new String[5];

        String[] kisiler;
        kisiler= new String[5];

        kisiler[0]="ALİ";
        kisiler[1]="MEHMET";
        kisiler[2]="AHMET";
        kisiler[3]="FATİH";
        kisiler[4]="DENİZ";

        for(int i=0; i<kisiler.length;i++) {
            System.out.println(kisiler[i] + "'in" + " kart numarası" + " nedir?");
            kartnumarası[i] = cardnumber.nextLine();

            if(kartnumarası.length<16 && kartnumarası.length>16 ){

                System.out.println("Lütfen 16 haneli tekrar kart numaranızı giriniz!");
            }
            kartnumarası[i] = kartnumarası[i].substring(0,6)+'x'+'x'+'x'+'x'+'x'+'x'+kartnumarası[i].substring(12,16);

            System.out.println(kartnumarası[i]);
        }


    }

}
