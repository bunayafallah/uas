/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasqueue;

/**
 *
 * @author Ramdon
 */
public class Uasqueue {
public class Queue {
    int queue[]=new int[3];  /** Deklarasikan Variable array untuk menentukan jumlah antrian pada stack */
   
    public void push(int value){
        if(queue[0]==0){ /** jika queue di index array 0 sama dengan 0 maka print queue di index ke 0*/
            queue[0]=value;
            System.out.println("PUSH "+queue[0]);
        }else if(queue[1]==0){ /** Ini Di ulangi sampai di index 3*/
            queue[1]=value;
            System.out.println("PUSH "+queue[1]);
        }else if(queue[2]==0){
            queue[2]=value;
            System.out.println("PUSH "+queue[2]);
        }else{
            isFull(); /** Method ini di panggil karna  apabila index queue bernilai 3 maka panggil method in */
        }
       
    }
    public void isFull(){
        System.out.println("QUEUE IS FULL");
    }
    public void pop(){ /** Method Ini unruk menghapus nilai yang ada dalama queue dengan konsep Fifo */
        if(queue[0]!=0){
            System.out.println("POP "+queue[0]);
            queue[0]=0;
        }else if(queue[1]!=0){
            System.out.println("POP "+queue[1]);
            queue[1]=0;
        }else if(queue[2]!=0){
            System.out.println("POP "+queue[2]);
            queue[2]=0;
        }else{
            isEmpty(); /** jika kondisi index array queue pada nilai 3 maka panggil method is empty*/
        }
    }
    public void isEmpty(){
        System.out.println("QUEUE IS EMPTY");
    }
    public void clear(){ /** Menghapus semua nilai yang di masukkan dalam queue*/
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("Queue is clear");
    }
    public void cetak(){
        System.out.println("-------------Print--------------");
        for(int i=0;i
