/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotriz;

import java.util.concurrent.Semaphore;

/**
 *
 * @author PC
 */
public class VehiclePlant {
    private String name;
    private int maxWorkerQty;
    private Worker[] workers;
    private long dayDurationInMs;
    public Warehouse warehouse;
    public Semaphore mutex;
    
    
     public VehiclePlant (String name, int maxWorkers, long dayDuration) {
        this.name = name;
        this.maxWorkerQty = maxWorkers;
        this.dayDurationInMs = dayDuration;
        this.workers = new Worker[maxWorkerQty];
        this.warehouse = new Warehouse(20, 30,10,10,01);
        this.mutex = new Semaphore(1);
        
       // initializeWorkers();k
        
        
    }
}
