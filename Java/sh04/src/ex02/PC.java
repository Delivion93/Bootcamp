package ex02;

import exeptions.IncorrectRamException;

public class PC {
    private String brand;
    private String model;
    private int gbOfRam;
    private int gbOfDiskStorage;
    private int gbOfStorageUsing;
    private boolean isEnabled;

    public PC() {
    }

    public PC(int gbOfRam) throws IncorrectRamException {
        if(gbOfRam%2!=0){
            throw new IncorrectRamException("incorrect amount of memory");
        }
        this.gbOfRam = gbOfRam;
    }

    public PC(int gbOfRam, int gbOfDiskStorage) throws IncorrectRamException {
        this(gbOfRam);
        this.gbOfDiskStorage = gbOfDiskStorage;
    }

    public PC(String brand, String model, int gbOfRam, int gbOfDiskStorage) throws IncorrectRamException {
        this(gbOfRam);
        this.brand = brand;
        this.model = model;
        this.gbOfDiskStorage = gbOfDiskStorage;
    }

    public void turnOn(){
        if(!isEnabled){
            isEnabled = true;
            System.out.println("starting Pc");
        }else{
            System.out.println("Pc is already turned on");
        }
    }
    public void turnOff(){
        if(isEnabled){
            isEnabled = false;
            System.out.println("turning off Pc");
        }else{
            System.out.println("Pc is already turned off");
        }
    }

    public void transferFiles(int filesSize){
        if(isEnabled){
            if((gbOfStorageUsing+filesSize)>gbOfDiskStorage){
                System.out.println("not enough storage space");
            }else {
                gbOfStorageUsing+=filesSize;
                System.out.printf("done\n%d Gb left on disk\n",gbOfDiskStorage-gbOfStorageUsing);
            }
        }else{
            System.out.println("Pc is turned off");
        }
    }

    public void deleteFiles(int filesSize){
        if(isEnabled){
            if((gbOfStorageUsing+filesSize)>gbOfDiskStorage){
                gbOfStorageUsing=0;
            }else {
                gbOfStorageUsing-=filesSize;
                System.out.printf("done\n%d Gb left on disk\n",gbOfDiskStorage-gbOfStorageUsing);
            }
        }else{
            System.out.println("Pc is turned off");
        }
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        PC object = (PC)obj;
        return this.brand.equals(object.brand)&&this.model.equals(object.model);
    }

    @Override
    public String toString(){
        return "Pc: brand: "+brand
                +" model: "+model
                +" RAM "+gbOfRam+"GB "
                +"disk storage: "
                +gbOfDiskStorage+"GB Storage used "
                +gbOfStorageUsing+"GB is enabled "
                +isEnabled;
    }

}
