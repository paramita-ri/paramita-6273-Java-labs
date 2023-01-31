/**
 * This Competition program is abstract class that have two protected String variables name 
 * and region with public setter ,getter method  for thoese two protected variables and
 * have two abstract method setDescription(), setSponsorship(ArrayList<String> sponsor)
 * 
 * Auther: paramita ritidet
 * ID: 653040627-3
 * sec: 1
 * Date: 20 Janruary 2023
 */
package ritidet.paramita.lab6;

import java.util.ArrayList;

abstract class Competition {
    protected String name,region;
    protected abstract void setDescription();
    protected abstract void setSponsorship(ArrayList<String> sponsor);
    
    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}