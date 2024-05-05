public class RangeInput {
    private int currentTemperature, maxTemperature, minTemperature;

    public RangeInput(){

    maxTemperature = 120;
    minTemperature = 80;
    MycurrentTemperature();
}

    private void MycurrentTemperature() {
        currentTemperature = (maxTemperature + minTemperature) / 2;
    }

    public RangeInput(int max,int min){

        maxTemperature=max;
        minTemperature=min;
        MycurrentTemperature();
    }
    public void Up(){
        currentTemperature=Math.min(currentTemperature + 1,maxTemperature);
    }
    public void Down(){
        currentTemperature=Math.max(currentTemperature - 1,minTemperature);
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }


}
