/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotriz;

/**
 *
 * @author PC
 */
public class Warehouse {
    public int chasisQty;
    public int ruedasQty;
    public int motorQty;
    public int accesoriosQty;
    public int carroceriaQty;
    
    public int maxchasisQty;
    public int maxruedasQty;
    public int maxmotorQty;
    public int maxaccesoriosQty;
    public int maxcarroceriaQty;
    
    
    public Warehouse(int maxChasis, int maxRuedas, int maxMotor, int maxAccesorios, int maxCarroceria){
    
        this.maxaccesoriosQty = maxAccesorios;
        this.maxruedasQty = maxRuedas;
        this.maxchasisQty = maxChasis;
        this.maxmotorQty = maxMotor;
        this.maxcarroceriaQty = maxCarroceria;
        
        chasisQty = 0;
        ruedasQty = 0;
        motorQty = 0;
        accesoriosQty = 0;
        carroceriaQty = 0;

    }
    
    public void Actualizar(String workerTipe, int finishedPart){
    
        switch(workerTipe){
        
            case"chasis":
                
                if(this.chasisQty < this.maxchasisQty){
                    this.chasisQty += finishedPart;
                    
                    System.out.println(chasisQty);
                }
                break;
            case"carroceria":
                if(this.carroceriaQty < this.maxcarroceriaQty){
                    this.carroceriaQty += finishedPart;
                    
                    System.out.println(carroceriaQty);
                }
                break;
            case"motor":
                if(this.motorQty < this.maxmotorQty){
                    this.motorQty += finishedPart;
                    
                    System.out.println(motorQty);
                }
                break;
            case"accesorios":
                if(this.accesoriosQty < this.maxaccesoriosQty){
                    this.accesoriosQty += finishedPart;
                    
                    System.out.println(accesoriosQty);
                }
                break;
            case"ruedas":
                if(this.ruedasQty < this.maxruedasQty){
                    this.ruedasQty += finishedPart;
                    
                    System.out.println(ruedasQty);
                }
                
            default:
                
                break;
        
        }
    
    } 
}
