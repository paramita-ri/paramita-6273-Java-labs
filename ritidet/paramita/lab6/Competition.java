package ritidet.paramita.lab6;

import java.util.ArrayList;

abstract class Competition {
    protected String name,region;
    
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
    abstract void setDescription();
    abstract void setSponsorship(ArrayList<String> sponsor);
}
